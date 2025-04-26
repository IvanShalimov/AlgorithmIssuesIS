val alphabet = ('a'..'z').toList()

fun main() {
    val input = "My name is Ivan!"
    val key = "meow"
    val output = cipherViginer(key, input)
    println("Input: $input")
    println("Output: $output")
}

fun cipherViginer(key: String, input: String): String {
    return buildString {
        input.forEachIndexed { index, char ->
        	if (char.isLetter()) {
                val keyIndex = calculateKeyIndex(index, key)
                val charIndex = alphabet.indexOf(char)
                append(findLetter(keyIndex+charIndex+index))
            } else {
                append(char)
            }
        }
    }
}


fun calculateKeyIndex(inputIndex: Int, key: String): Int {
    var index = inputIndex
    while(index >= key.length){
        index -= key.length
    }
    if (index < 0) index = 0
    return alphabet.indexOf(key[index])
}

fun findLetter(index: Int): Char {
    return alphabet[index%26] // English alphabet size = 26
}