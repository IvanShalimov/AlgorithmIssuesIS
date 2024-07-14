/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/contains-duplicate-ii/
 * 
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] 
 * and abs(i - j) <= k.
 * 
 * Дан массив целых чисел nums и целое число k, верните true если есть два различных индекса: 
 * 1) значения по этим индексам равны, 
 * 2) модуль их разности меньше или равен k. 
 * 
 * В противном случае верните false.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 * - 0 <= k <= 10^5
 * 
 * Score solution/Оценка решения:
 * Runtime beats 5,10%
 * Memory beats 80,27%
 * 
 * https://t.me/c/2225351477/64
 */
class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        if(nums.size < 2) return false
        for(i in 0..nums.size-2) {
            for (j in i+1..nums.size-1) {
                if(nums[i] == nums[j] && abs(i-j) <= k) {
                    return true
                }
            }
        }

        return false
    }
}