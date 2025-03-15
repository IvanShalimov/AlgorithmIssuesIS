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
* You will go to the store.
* I am your father.
* The dark side is powerful.
* We must trust the Force.
* Do you understand the Force?
* Is the dark side stronger?
* Can you feel the power?
* Will you join me?
* */
fun main() {
    println(getYodaString("You will go to the store"))
}

fun getYodaString(original: String): String {
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