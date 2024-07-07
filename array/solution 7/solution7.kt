/**
 * 
 * Source/Исчтоник: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Issue/Проблема:
 * 
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * 
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * 
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
 * The remaining elements of nums are not important as well as the size of nums.
 * 
 * Return k.
 * 
 * -
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= nums.length <= 3 * 10^4
 * - -100 <= nums[i] <= 100
 * - nums is sorted in non-decreasing order.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 55,50%
 * Memory beats 95,21%
 * 
 * Telegram: -
 */
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val set = mutableSetOf<Int>()
        for(num in 0..nums.size-1) {
            set.add(nums[num])
        }
        val tempArray = set.toIntArray()

        for(temp in 0..tempArray.size-1) {
            nums[temp] = tempArray[temp]
        }
        return set.toList().size
    }
}