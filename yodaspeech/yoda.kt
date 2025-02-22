val predicates = listOf("am","is","are", "ain't")

fun main() {
    val spo = splitOnSPO("You are mighty master jedi")
    if (spo.isEmpty()) return
    
    val yodaSays = mapYodaSentence(
    	spo.first(),
        spo[1],
        spo.last()
    )
	println(yodaSays)
}

fun splitOnSPO(rawSpeech: String): List<String> {
    val words = rawSpeech.split(" ")
    
    var predicateIndex = -1
    words.forEachIndexed {index, word ->
    	if(predicates.contains(word)) {
            predicateIndex = index
        }
    }
    if (predicateIndex == -1 || predicateIndex == 0) return emptyList<String>()
    
    var subject = ""
    for (index in 0..predicateIndex-1) {
        subject += "${words[index]} "
    }
    subject = subject.trim()
    
    var `object` = ""
    for (index in predicateIndex+1..words.size-1) {
        `object` += "${words[index]} "
    }
    `object` = `object`.trim()
    
    return listOf<String>(subject, words[predicateIndex], `object`)
}


/**
 * OSV
 * Example:
 * Input
 * "You"
 * "are"
 * "mighty master jedi"
 * 
 * Output
 * "Mighty master jedi"
 * "you"
 * "are"
 * */
fun mapYodaSentence(
	subject: String,
    predicate: String, 
    `object`: String
): String {
    
    return "${`object`.capitalize()} ${subject.lowercase()} $predicate"
}