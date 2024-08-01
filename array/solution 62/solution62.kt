/**
 *
 * Issue/Проблема: https://leetcode.com/problems/range-sum-query-immutable/
 * 
 * You are playing the following Nim Game with your friend:
 * 
 * Given an integer array nums, handle multiple queries of the following type:
 * 
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * Implement the NumArray class:
 * 
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= nums.length <= 104
 * - 10^5 <= nums[i] <= 10^5
 * - 0 <= left <= right < nums.length
 * - At most 104 calls will be made to sumRange.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 26,62% 
 * Memory beats 48,20% 
 * 
 * Telegram: https://t.me/c/2225351477/93
 */
class NumArray(val nums: IntArray) {

    fun sumRange(left: Int, right: Int): Int {
        var sum = 0 
        for(index in left..right) {
            sum+=nums[index]
        }
        return sum
    }

}