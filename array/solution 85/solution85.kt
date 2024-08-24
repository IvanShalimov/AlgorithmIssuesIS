/**
 *
 * Issue/Проблема: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * 
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] 
 * that do not appear in nums.
 * 
 * Constraints/Ограничения:
 * 
 * - n == nums.length
 * - 1 <= n <= 10^5
 * - 1 <= nums[i] <= n
 * 
 * Score solution/Оценка решения:
 * Runtime beats 36,93% O(N) 
 * Memory beats 47,16% O(N)
 * 
 * Telegram: https://t.me/c/2225351477/113
 */
class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        var digits = hashSetOf<Int>()
        for(i in nums) {
            digits.add(i)
        }
        var result = mutableListOf<Int>()
        for(i in 1..nums.size) {
            if(!digits.contains(i)) result.add(i)
        }
        return result
    }
}