fun main() {
    val testString0 = "abcd"
    println("Input: $testString0 -> Output: ${compressString(testString0)}")
    val testString1 = "aaabbbbcc"
    println("Input: $testString1 -> Output: ${compressString(testString1)}")
    
}

fun compressString(input: String): String {
    val output = buildString {
        var lastChar = '-'
        var counter = 0
        input.forEach { char ->
            if(counter == 0) {
                //first in sequence
                lastChar = char
                counter++
            } else {
                if (lastChar == char) {
                    // sama character, increment counter
                    counter++
                } else {
                    val finalCounter = if (counter>2) counter.toString() else ""
                    append("$lastChar$finalCounter")
                    lastChar = char
                    counter = 1
                }
            }
        }
        if(counter != 0) {
            val finalCounter = if (counter>2) counter.toString() else ""
            append("$lastChar$finalCounter")
            lastChar = '-'
            counter = 0
        }
    }
    return if (output.length >= input.length) {
        input
    } else {
        output
    }
}
