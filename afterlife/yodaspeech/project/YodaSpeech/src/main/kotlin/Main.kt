package org.example

import opennlp.tools.cmdline.parser.ParserTool
import opennlp.tools.tokenize.TokenizerME
import opennlp.tools.tokenize.TokenizerModel
import opennlp.tools.postag.POSModel
import opennlp.tools.postag.POSTaggerME
import opennlp.tools.parser.ParserFactory
import opennlp.tools.parser.ParserModel
import opennlp.tools.parser.Parse
import java.io.FileInputStream

enum class TYPE_OF_SENTENCE {
    SENTENCE,
    QUESTION;
}

val verbs = listOf("am","is","are", "ain't", "was", "were", "will", "can", "may")
val moveVerbs = listOf("am","is","are", "ain't", "was", "were")
val questionVerbs = listOf("do", "does", "did", "could", "would") + verbs


/*
* The cat is eating fish
* You are mighty master jedi
* You will go to the store
* I am your father
* The dark side is powerful
* We must trust the Force
* Do you understand the Force?
* Is the dark side stronger?
* Can you feel the power?
* */
fun main() {
    println(getYodaString("Is the dark side stronger?", 2))
}

fun getYodaString(original: String, version:Int): String {
    return when(version) {
        1 -> getYodaStringV1(original)
        2 -> getYodaStringV2(original)
        else -> ""
    }
}

private fun getYodaStringV1(original: String): String {
    return when(getTypeOfSentence(original)) {
        TYPE_OF_SENTENCE.QUESTION -> {
            val spo = splitQuestionOnSPO(original)
            if (spo.isEmpty()) return ""

            "${spo[2].capitalize()} ${spo[1].lowercase()} ${spo[0].lowercase()} "+"?"
        }
        TYPE_OF_SENTENCE.SENTENCE -> {
            val spo = splitSentenceOnSPO(original)
            if (spo.isEmpty()) return ""

            "${spo[2].capitalize()} ${spo[0].lowercase()} ${spo[1].lowercase()}"
        }
    }
}

private fun getYodaStringV2(original: String): String {
    return when(getTypeOfSentence(original)) {
        TYPE_OF_SENTENCE.QUESTION -> {
            val spo = splitSentenceOnSPOV2(original.replace("?",""), true)
            if (spo.isEmpty()) return ""

            "${spo[2].capitalize()} ${spo[1].lowercase()} ${spo[0].lowercase()} "+"?"
        }
        TYPE_OF_SENTENCE.SENTENCE -> {
            val spo = splitSentenceOnSPOV2(original, false)//splitSentenceOnSPO(original)
            if (spo.isEmpty()) return ""

            "${spo[2].capitalize()} ${spo[0].lowercase()} ${spo[1].lowercase()}"
        }
    }
}

fun getTypeOfSentence(sentence: String): TYPE_OF_SENTENCE {
    val words = sentence.lowercase()
        .replace("[^a-zA-Z ]".toRegex(), "")
        .split(" ")
        .filter { it.isNotBlank()}

    return when {
        questionVerbs.contains(words[0]) -> TYPE_OF_SENTENCE.QUESTION
        else -> TYPE_OF_SENTENCE.SENTENCE
    }
}

fun splitSentenceOnSPOV2(rawSpeech: String,isQuestion: Boolean): List<String> {
    // Load models
    val tokenizerModel = TokenizerModel(FileInputStream("src/main/resources/models/en-token.bin"))
    val posModel = POSModel(FileInputStream("src/main/resources/models/en-pos-maxent.bin"))
    val parserModel = ParserModel(FileInputStream("src/main/resources/models/en-parser-chunking.bin"))

    // Initialize tools
    val tokenizer = TokenizerME(tokenizerModel)
    val posTagger = POSTaggerME(posModel)
    val parser = ParserFactory.create(parserModel)

    // Input sentence
    val sentence = rawSpeech

    // Step 1: Tokenize the sentence
    val tokens = tokenizer.tokenize(sentence)

    // Step 2: Perform POS tagging
    val tags = posTagger.tag(tokens)

    // Step 3: Parse the sentence
    val parse = ParserTool.parseLine(sentence, parser, 1).first()

    // Step 4: Extract subject, verb, and object
    val (subject, verb, obj) = extractSVO(parse, isQuestion)

    return listOf(subject, verb, obj)
}

fun extractSVO(parse: Parse, isQuestion: Boolean): Triple<String, String, String> {
    var subject = ""
    var verb = ""
    var obj = ""

    // Рекурсивная функция для поиска SVO
    fun traverse(node: Parse) {
        when (node.type) {
            "NP" -> if (subject.isEmpty()) subject = node.coveredText  // Первое найденное NP - это подлежащее
            "VBP" -> {
                node.children.forEach { child ->
                    if (child.type.startsWith("TK")
                    ) {
                        if(verb.isEmpty()) {
                            verb += child.coveredText
                        } else {
                            verb += " ${child.coveredText}"
                        }
                    }
                }
            }
            "."->{
                node.children.forEach { child ->
                    if(obj.isEmpty()) {
                        obj += child.coveredText
                    } else {
                        obj += " ${child.coveredText}"
                    }
                }
            }
            "VBZ"->{
                // Ищем глагол
                node.children.forEach { child ->
                    if(verb.isEmpty()) {
                        verb += child.coveredText
                    } else {
                        verb += " ${child.coveredText}"
                    }
                }
            }
            "VP" -> {
                // Ищем глагол
                node.children.forEach { child ->
                    if (child.type.startsWith("VB") ||
                        child.type.startsWith("VBG") ||
                        child.type.startsWith("VBZ") ||
                        child.type.startsWith("MD")
                        ) {
                        if(verb.isEmpty()) {
                            verb += child.coveredText
                        } else {
                            verb += " ${child.coveredText}"
                        }
                    }
                }
                // Ищем объект
                node.children.forEach { child ->
                    if (
                        child.type == "NP" ||
                        child.type == "TO" ||
                        child.type == "DT" ||
                        child.type == "NN"
                        ) {
                        if(obj.isEmpty()) {
                            obj = child.coveredText
                        } else {
                            obj += " ${child.coveredText}"
                        }

                    }
                }
            }
            "PP" -> {
                // Ищем объект
                node.children.forEach { child ->
                    if (
                        child.type == "NP" ||
                        child.type == "TO" ||
                        child.type == "DT" ||
                        child.type == "NN"
                    ) {
                        if(obj.isEmpty()) {
                            obj = child.coveredText
                        } else {
                            obj += " ${child.coveredText}"
                        }

                    }
                }
            }
            "ADJP" -> {
                node.children.forEach { child ->
                    if (
                        child.type == "JJ"
                    ) {
                        if(obj.isEmpty()) {
                            obj = child.coveredText
                        } else {
                            obj += " ${child.coveredText}"
                        }

                    }
                }
            }
            "MD"-> {
                if (isQuestion) {
                    // Ищем глагол
                    node.children.forEach { child ->
                        if (verb.isEmpty()) {
                            verb += child.coveredText
                        } else {
                            verb += " ${child.coveredText}"
                        }
                    }
                }
            }
        }
        // Рекурсивно обходим всех детей узла
        node.children.forEach { traverse(it) }
    }

    traverse(parse)
    return Triple(subject, verb, obj)
}

fun splitSentenceOnSPO(rawSpeech: String): List<String> {
    val words = rawSpeech.replace("[^a-zA-Z ]".toRegex(), "")
        .split(" ")
        .filter { it.isNotBlank()}

    var predicateIndex = -1
    words.forEachIndexed {index, word ->
        if(verbs.contains(word)) {
            predicateIndex = index
        }
    }
    if (predicateIndex == -1 || predicateIndex == 0) return emptyList()

    val isWill = words[predicateIndex] == "will"
    val verb = if (isWill) words[predicateIndex]+" "+words[predicateIndex+1] else words[predicateIndex]

    var subject = ""

    for (index in 0..<predicateIndex) {
        subject += "${words[index]} "
    }
    subject = subject.trim()

    var obj = ""
    val objectStart = if(isWill) predicateIndex+2 else predicateIndex+1
    for (index in objectStart..<words.size) {
        obj += "${words[index]} "
    }
    obj = obj.trim()

    return listOf(subject, verb, obj)
}

fun splitQuestionOnSPO(rawSpeech: String): List<String> {
    val words = rawSpeech.replace("[^a-zA-Z ]".toRegex(), "")
        .split(" ")
        .filter { it.isNotBlank()}

    val verb = words[0]

    val isMoveVerb = moveVerbs.contains(verb)

    val subject = if (isMoveVerb) {
        var temp = ""
        for (index in 1..<words.lastIndex) {
            temp += "${words[index]} "
        }
        temp.trim()
    } else {
        words[1]
    }

    val obj = if (isMoveVerb) {
        words[words.lastIndex]
    } else {
        var temp = ""
        for (index in 2..<words.size) {
            temp += "${words[index]} "
        }
        temp.trim()
    }


    return listOf(subject, verb, obj)
}