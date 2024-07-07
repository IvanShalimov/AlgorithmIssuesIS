/**
 * 
 * Source/Исчтоник: https://leetcode.com/problems/majority-element/
 * Issue/Проблема:
 * 
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * 
 * Дан массив nums размера n. Верните наиболее встречающийся элемент(мажоритарный). 
 * Мажоритарный элемент это такой элемент, который в множестве данных размера n встречается n/2+1 или более.
 * 
 * Constraints/Ограничения:
 * 
 * - n == nums.length
 * - 1 <= n <= 5 * 10^4
 * - -10^9 <= nums[i] <= 10^9
 * 
 * Score solution/Оценка решения:
 * Runtime beats 62,09%
 * Memory beats 45,77%
 * 
 * Telegram: https://t.me/c/2225351477/47
 */
class Solution {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate = 0
        for (element in nums) {
            if(count == 0) {
                candidate = element
            }
            count += if(candidate == element) 1 else -1
        }

        return candidate
    }
}