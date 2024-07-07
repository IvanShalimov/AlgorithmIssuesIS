/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/two-sum/
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * -
 * 
 * Constraints/Ограничения:
 * 
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - 10^9 <= target <= 10^9
 * - Only one valid answer exists.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 5,05%
 * Memory beats 99,81%
 * 
 * Telegram: -
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2){-1} 
        var stub = true
        var startIndex = 0
        var endIndex = nums.size-1

        while(stub) {
            stub = false
            if(startIndex == endIndex) {
                startIndex++
                endIndex = nums.size-1
                if(startIndex >= nums.size-1) {
                    break
                }
                stub = true
            }

            if( (nums[startIndex]+nums[endIndex]) == target) {
                result[0] = startIndex
                result[1] = endIndex
                stub = false
                break
            } else {
                endIndex--
                stub = true
            }
        }
        return result
    }
}