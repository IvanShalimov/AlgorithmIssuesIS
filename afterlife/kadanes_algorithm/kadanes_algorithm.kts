fun maxSubArray(nums: IntArray): Int {
    if (maxSum.size == 0) return 0
    var maxSum = nums[0]
    var currentSum = nums[0]
    for (i in 1 until nums.size) {
        currentSum = maxOf(nums[i], currentSum + nums[i])
        maxSum = maxOf(maxSum, currentSum)
    }
    if (maxSum < 0) return 0
    return maxSum
}