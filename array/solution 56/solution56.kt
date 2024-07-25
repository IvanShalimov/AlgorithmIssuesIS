/**
 *
 * Issue/Проблема: https://leetcode.com/problems/missing-number/
 * 
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * 
 * Дан массив уникальных целых чисел в диапазоне от 0 до числа равного размеру массива. Оно число пропущено - верните его.
 * 
 * Constraints/Ограничения:
 * 
 * - n == nums.length
 * - 1 <= n <= 10^4
 * - 0 <= nums[i] <= n
 * - All the numbers of nums are unique.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 94,52% (O(N))
 * Memory beats 66,36% (O(1))
 * 
 * -
 */
class Solution {
    fun missingNumber(nums: IntArray): Int {
        var expected = 0
        for(index in 1..nums.size) expected += index
        var actuale = 0
        for(index in 0..nums.size-1) actuale += nums[index]
        return expected - actuale  
    }
}