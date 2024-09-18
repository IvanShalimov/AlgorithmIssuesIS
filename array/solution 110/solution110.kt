/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/array-partition/
 * 
 * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) 
 * such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= n <= 10:4
 * - nums.length == 2 * n
 * - -10:4 <= nums[i] <= 10:4
 * 
 * Score solution/Оценка решения:
 * Runtime beats 88,71% O(N) 
 * Memory beats 72,58% O(1)
 * 
 * TG: https://t.me/c/2225351477/123
 */
class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        val array = IntArray(20001)
        var i = 0
        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        while (i < nums.size) {
            val index = nums[i++] + 10_000
            max = max(max, index)
            min = min(min, index)
            array[index]++
        }

        var sum = 0
        var iterations = sum
        i = max
        while (i >= min) {
            var j = array[i]
            while (j != 0) {
                iterations++
                when {
                    iterations == 2 -> {
                        sum += i
                        iterations = 0
                    }
                }
                j--
            }
            i--
        }
        sum -= 5_000 * nums.size
        return sum
    }
}