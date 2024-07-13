/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/contains-duplicate/
 * 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * 
 * Дан массив целых чисел nums, верните true, если одно из чисел встречается в нем по крайней мере дважды, в противном случае верните false.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 * 
 * Score solution/Оценка решения:
 * Runtime beats 89,37%
 * Memory beats 36,69%
 * 
 * Telegram: https://t.me/c/2225351477/63
 */
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numbers = mutableSetOf<Int>()
        for(index in nums.indices) {
            if(numbers.contains(nums[index])) return true
            numbers.add(nums[index])
        }
        return false
    }
}