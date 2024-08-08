/**
 *
 * Issue/Проблема: https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * 
 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 * 
 * Даны два целочисленных массива, верните их пересечения. 
 * Все значения должны быть добавлены столько раз сколько встречаются и могут располагаться в любом порядке
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= nums1.length, nums2.length <= 1000
 * - 0 <= nums1[i], nums2[i] <= 1000
 * 
 * Score solution/Оценка решения:
 * Runtime beats 98,14%
 * Memory beats 97,91% 
 * 
 * Telegram: https://t.me/c/2225351477/103
 */
class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val counters = IntArray(1001)
        val (n1, n2) = when {
            nums1.size < nums2.size -> nums1 to nums2
            else -> nums2 to nums1
        }

        for (i in 0 until n1.size) {
            counters[n1[i]]++
        }

        ti = 0
        for (i in 0 until n2.size) {
            val m = n2[i]
            if (counters[m]-- >= 1) temp[ti++] = m
        }
        val result = IntArray(ti)
        System.arraycopy(temp, 0, result, 0, result.size)
        return result
    }

    companion object {
        var ti = 0
        val temp = IntArray(1001)
    }
}