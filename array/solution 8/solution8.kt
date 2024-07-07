/**
 * 
 * Source/Исчтоник: https://leetcode.com/problems/remove-element/description/
 * Issue/Проблема:
 * 
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. 
 * Then return the number of elements in nums which are not equal to val.
 * 
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * 
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * 
 * Return k.
 * 
 * -
 * 
 * Constraints/Ограничения:
 * 
 * - 0 <= nums.length <= 100
 * - 0 <= nums[i] <= 50
 * - 0 <= val <= 100
 * 
 * Score solution/Оценка решения:
 * Runtime beats 13,68%
 * Memory beats 42,28%
 * 
 * Telegram: -
 */
class Solution {
    
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val resultArray = nums.filter { it != `val`}
        
        for(index in 0..resultArray.size-1) {
            nums[index] = resultArray[index]
        }
        
        return resultArray.size
    }
}