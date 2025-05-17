fun main() {
    val input = listOf("listen", "silent", "dog", "god", "hello", "olelh")
    val output = lsitToCortege(input)
    println(output)
    
}

fun lsitToCortege(input: List<String>): List<List<String>> {
    val handledList = mutableListOf<Int>()
    repeat(input.size) {
        handledList.add(0)
    } 
    
    val output = mutableListOf<List<String>>()
    
    input.forEachIndexed { index, item -> 
        if(handledList[index] == 0) {
            val group = createGroup(index+1, input, handledList)
            if(group.isNotEmpty()) {
            	output.add(group)  
                handledList[index] = 1
            }
        }
    }
    
    return output
}

fun createGroup(startIndex: Int, input: List<String>, handledList: MutableList<Int>): List<String> {
    if(startIndex >= input.size) return emptyList()
    
    var output = mutableListOf<String>()
    output.add(input[startIndex])
    for(index in startIndex..input.size-1) {
        if(input[startIndex].toSet() == input[index].toSet()) {
            output.add(input[index])
            handledList[index] = 1
        }
    }
    return output
}