val vowelLetters = listOf('a', 'e', 'i', 'o', 'u', 'y')
val consonantLetter = listOf('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z')

fun main() {
    val input = "My name is Ivan!"
    val output = patternReplacementCipher(input)
    println("Input: $input")
    println("Output: $output")
}


fun patternReplacementCipher(input: String): String {
    return buildString {
        input.forEach { char ->
        	if(char.isLetter()) {
            	append(replacement(char))
        	} else {
                append(char)
            }
    	}
    }
}

private fun replacement(char: Char): Char {
    val isCapitalize = !char.isLowerCase()
    
    val vowelIndex = vowelLetters.indexOf(char.lowercaseChar())
    val consonantIndex = consonantLetter.indexOf(char.lowercaseChar()
    
    val nextChar = when {
    		vowelIndex != -1 -> {
                if(vowelIndex+1 >= vowelLetters.size) {
                    vowelLetters[0]
                } else {
                	vowelLetters[vowelIndex+1]    
                }
            }
            consonantIndex != -1 -> {
                if(consonantIndex+1 >= consonantLetter.size) {
                   consonantLetter[0]
                } else {
                	consonantLetter[consonantIndex+1]    
                }
            }
            else -> '?'
    }
    
    return if (isCapitalize) {
        nextChar.toUpperCase()
    } else {
        nextChar
    }
}
