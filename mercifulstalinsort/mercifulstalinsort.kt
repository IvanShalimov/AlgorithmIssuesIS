fun main() {
    val inputList = listOf(1, 2, 4, 3, 6, 5, 7)
    val result = mercifulStalinsortWithReinsertion(inputList)

    println("Final Merged List: $result")
}

fun mercifulStalinsortWithReinsertion(list: List<Int>): List<Int> {
    if (list.isEmpty()) return emptyList()

    // Step 1: Perform the "merciful" Stalinsort
    val sortedList = mutableListOf(list[0])
    val eliminatedList = mutableListOf<Int>()

    for (i in 1 until list.size) {
        if (list[i] >= sortedList.last()) {
            sortedList.add(list[i])
        } else {
            eliminatedList.add(list[i])
        }
    }

    // Step 2: Merge the sortedList and eliminatedList while maintaining order
    val mergedList = mutableListOf<Int>()
    var sortedIndex = 0
    var eliminatedIndex = 0

    while (sortedIndex < sortedList.size && eliminatedIndex < eliminatedList.size) {
        if (sortedList[sortedIndex] <= eliminatedList[eliminatedIndex]) {
            mergedList.add(sortedList[sortedIndex])
            sortedIndex++
        } else {
            mergedList.add(eliminatedList[eliminatedIndex])
            eliminatedIndex++
        }
    }

    // Add remaining elements from sortedList (if any)
    while (sortedIndex < sortedList.size) {
        mergedList.add(sortedList[sortedIndex])
        sortedIndex++
    }

    // Add remaining elements from eliminatedList (if any)
    while (eliminatedIndex < eliminatedList.size) {
        mergedList.add(eliminatedList[eliminatedIndex])
        eliminatedIndex++
    }

    return mergedList
}