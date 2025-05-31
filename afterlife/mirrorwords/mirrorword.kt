

fun main() {
    val testSentence = "She loves apple"//Hello world, it's a test
    
    println(mirrorWords(testSentence))
}

fun mirrorWords(input: String): String {
    val words = input.split(" ")
    return buildString {
        words.forEach { word ->
    		append(mirrorWord(word))
            append(" ")
        }
    }.trim()
}

val punctuationMarks = listOf(',','.','!','?',':')

fun mirrorWord(word: String): String {
    if(word.contains("'")) return word
    if(word.length <= 2) return word
    
    if(punctuationMarks.contains(word.last())) {
        val lastChar = word.last()
        return word.substring(0, word.lastIndex).reversed() + lastChar
    }
    
    return word.reversed()
}