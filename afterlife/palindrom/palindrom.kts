fun main() {
    val testString = "AllA"
    val oneCharString = "A"
    val emptyString = ""
    val noPalindromString = "Allo"
    
    println("Version 1")
    println("$testString is palindrom - " + isPalindrom(testString.lowercase()))
    println("$oneCharString is palindrom - " + isPalindrom(oneCharString.lowercase()))
    println("$emptyString is palindrom - " + isPalindrom(emptyString.lowercase()))
    println("$noPalindromString is palindrom - " + isPalindrom(noPalindromString.lowercase()))
    
    println("Version 2")
    println("$testString is palindrom - " + isPalindromVer2(testString))
    println("$oneCharString is palindrom - " + isPalindromVer2(oneCharString))
    println("$emptyString is palindrom - " + isPalindromVer2(emptyString))
    println("$noPalindromString is palindrom - " + isPalindromVer2(noPalindromString))
}

fun isPalindrom(input: String): Boolean {
    if (input.isEmpty()) return false
    
    var startIndex = 0
    var endIndex = input.length-1
    
    while (startIndex <= endIndex) {
        if(input[startIndex] != input[endIndex]) {
            return false
        }
        startIndex++
        endIndex--
    }
    
    return true
}

fun isPalindromVer2(input: String): Boolean {
	val cleanStr = input.filter { it.isLetterOrDigit() }.lowercase()
    return cleanStr == cleanStr.reversed()
}