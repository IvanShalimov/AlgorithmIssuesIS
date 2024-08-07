/**
 *
 * Issue/Проблема: https://leetcode.com/problems/intersection-of-two-arrays/
 * 
 * Given two integer arrays nums1 and nums2, return an array of their 
 * intersection. Each element in the result must be unique and you may return the result in any order.
 * 
 * Даны два целочисленных массива, верните их пересечения. Все значения должны быть уникальный и могут располагаться в любом порядке.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= nums1.length, nums2.length <= 1000
 * - 0 <= nums1[i], nums2[i] <= 1000
 * 
 * Score solution/Оценка решения:
 * Runtime beats 87,30% O(N*M) 
 * Memory beats 78,83% O(N)
 * 
 * Telegram: https://t.me/c/2225351477/102
 */
class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val intersections: MutableSet<Int> = mutableSetOf()
        if(nums2.size < nums1.size) {
            for(i in 0..nums2.size-1) {
                for(j in 0..nums1.size-1) {
                    if(nums2[i] == nums1[j]) {
                        intersections.add(nums1[j])
                        break
                    }
                }
            }
        } else {
            for(i in 0..nums1.size-1) {
                for(j in 0..nums2.size-1) {
                    if(nums2[j] == nums1[i]) {
                        intersections.add(nums2[j])
                        break
                    }
                }
            }
        }
        return intersections.toIntArray()
    }
}