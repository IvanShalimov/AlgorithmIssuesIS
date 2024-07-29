/**
 *
 * Issue/Проблема: https://leetcode.com/problems/move-zeroes/
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 *  Дан массив nums, переместите все нули в конец массива, сохраняя порядок ненулевых элементов. Следует сделать это не прибегая к копированию массива.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= nums.length <= 104
 * -  -2^31 <= nums[i] <= 2^31 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 79,38% (O(N))
 * Memory beats 81,58% (O(1))
 * 
 * Telegram: https://t.me/c/2225351477/89
 */
class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var insertPos = 0
        nums.forEach {
            if(it != 0) {
                nums[insertPos] = it
                insertPos++
            }
        }
        
        for(i in insertPos..nums.size-1) {
            nums[i] = 0
        }
    }
}