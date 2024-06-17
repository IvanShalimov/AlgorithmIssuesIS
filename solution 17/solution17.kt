/**
 * Source/Исчтоник: https://leetcode.com/problems/merge-sorted-array/
 * Issue/Проблема:
 * 
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * 
 * Даны два не убывающих массива nums1 и nums2. Так же даны два числа m и n. Первое презентует количество "не пустых" элементов в массиве nums1, 
 * второе презентует количество элементов в массив nums2. Размер массива nums1 = n+m. Требуется  объединить два массива и поместить результат в массив nums1.
 * 
 * Constraints/Ограничения:
 *
 * - nums1.length == m + n
 * - nums2.length == n
 * - 0 <= m, n <= 200
 * - 1 <= m + n <= 200
 * - -10^9 <= nums1[i], nums2[j] <= 10^9
 * 
 * Score solution/Оценка решения:
 * Runtime beats 5,36%
 * Memory beats 40,99%
 * 
 * Telegram: https://t.me/c/2225351477/22
 */
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        if(nums2.size == 0) return 
        //if(nums2.size == 1) nums1[0] = nums2[0]

        var offset = 0
        var indexN = 0
        for(index in m..nums1.size-1) {
            nums1[index] = nums2[indexN]
            indexN++
        }

        var swapped = true
        while(swapped) {
            swapped = false
            for(i in 1 until nums1.size) {
                if(nums1[i] < nums1[i-1]) {
                    swap(nums1, i, i-1)
                    swapped = true
                }
            }
        }
    }

    fun swap(array: IntArray, i: Int, j: Int) {
        val temp = array[j]
        array[j] = array[i]
        array[i] = temp
    }
}