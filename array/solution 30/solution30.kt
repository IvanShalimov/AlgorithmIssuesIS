/**
 * Source/Исчтоник: https://leetcode.com/problems/single-number/
 * Issue/Проблема:
 * 
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * 
 * Дан не пустой массив целых чисел. Каждый элемент появляется дважды, кроме  одного. Найдите и верните его.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= nums.length <= 3 * 10^4
 * - -3 * 10^4 <= nums[i] <= 3 * 10^4
 * - Each element in the array appears twice except for one element which appears only once..
 * 
 * Score solution/Оценка решения:
 * Runtime beats 5,21%
 * Memory beats 57,66%
 * 
 * Telegram: https://t.me/c/2225351477/35
 */
class Solution {
    fun singleNumber(nums: IntArray): Int {
        //corner case
        if(nums.size == 1) return nums[0]
        //selection sort
        for (i in 0..nums.size-1) {
            var indexOfMin = i
            for (j in nums.size-1 downTo i) {
                if(nums[j] < nums[indexOfMin]) indexOfMin = j
            }
            if(i != indexOfMin) {
                swap(nums, i, indexOfMin)
            }
        }
        //find unique element
        var index = 0
        var result = nums[0]
        while(index < nums.size) {
            if(index == nums.size-1) {
                result = nums[index]
                break
            }
            if(nums[index] != nums[index+1]) {
                result = nums[index]
                break
            }
            index = index + 2
        }
        return result
    }

    fun swap(array: IntArray, i: Int, j: Int) {
        val temp = array[j]
        array[j] = array[i]
        array[i] = temp
    }
}