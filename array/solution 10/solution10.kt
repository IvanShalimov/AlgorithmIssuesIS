/**
 * Source/Исчтоник: https://leetcode.com/problems/search-insert-position/
 * Issue/Проблема:
 * 
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Дан отсортированный массив целых чисел и искомое число. Требуется найти индекс позиции, на которой стоит искомое число. 
 * Если такого числа найти не удалось, то надо указать индекс позиции на которую следует поставить искомое число. 
 * Вставлять число не требуется. Алгоритм должен быть по сложности O(log(n))
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 * - nums contains distinct values sorted in ascending order.
 * - -10^4 <= target <= 10^4
 * 
 * Score solution/Оценка решения:
 * Runtime beats 17,31%
 * Memory beats 44,04%
 * 
 * Telegram: https://t.me/c/2225351477/13
 */
class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if(target > nums[nums.size-1]) return nums.size
        if(target < nums[0]) return 0
        var index = 0
        while(index < nums.size && target > nums[index]) {
            index++
        }
        return index
    }
}