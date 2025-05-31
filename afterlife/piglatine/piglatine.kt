val consonants = listOf<Char>('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z')
val vowels = listOf<Char>('a', 'e', 'i', 'o', 'u', 'y')

fun main() {
    val testSentence = "She loves apple"
    val result =  buildString {
    	testSentence.lowercase().split(" ").forEach { word ->
            println(word)
            val a = cipherPig(word)
            println(a)
        	append(a)
            append(" ")
    	}    
    }
    
    print(result.capitalize())
    
	//println(cipherPig("banana"))
}

fun cipherPig(word: String) : String {
    val isConstants = consonants.contains(word.first())
    val isVowels = vowels.contains(word.first())
    
    return when {
        isConstants -> word.subSequence(1, word.length ).toString() + word.first().toString() + "ay"
        isVowels -> word+"way"
        else -> ""
    }
}