fun main() {
    val testArray = intArrayOf(1,2,3,4,5)
    val target1 = 8
    val target2 = 10
  
    try {
        val result1 = twoSum(testArray, target1)
    	println("Resutl 1: ${result1.joinToString()}")    
    } catch (exception: IllegalStateException) {
        println("For target $target1 in ${testArray.joinToString()} is no solution")
    }
    
    try {
        val result2 = twoSum(testArray, target2)
    	println("Resutl 2: ${result2.joinToString()}")
    } catch (exception: IllegalStateException) {
        println("For target $target2 in [${testArray.joinToString()}] is no solution")
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()
    for (index in nums.indices) {
        val complaint = target - nums[index]
        if (map.contains(complaint)) {
            return intArrayOf(complaint, nums[index])
        }
        map.put(nums[index], nums[index])
    }
    throw IllegalStateException("No solution")
}