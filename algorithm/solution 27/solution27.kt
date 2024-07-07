/**
 * Source/Исчтоник: https://leetcode.com/problems/pascals-triangle-ii/
 * Issue/Проблема:
 * 
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * 
 * Дан индекс строки rowIndex в треугольнике паскаля, верните строку под этим индексом.
 * 
 * Constraints/Ограничения:
 * 
 * - 0 <= rowIndex <= 33
 * 
 * Score solution/Оценка решения:
 * Runtime beats 39,87%
 * Memory beats 87,97%
 * 
 * Telegram: https://t.me/c/2225351477/32
 */
class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        if(rowIndex < 0) return emptyList()

        val result = MutableList<Int>(rowIndex+1) {1}
        var cache = result.mutableCopyOf()
        var currentRowIndex = 0

        while (currentRowIndex <= rowIndex) {
            for(index in 0..currentRowIndex) {
                if(index == 0 || index == currentRowIndex) {
                    result[index] = 1
                    continue
                }
                result[index] = cache[index] + cache[index-1]
            }
            cache = result.mutableCopyOf()
            currentRowIndex++
        }

        return result
    }

    fun <T> List<T>.mutableCopyOf(): MutableList<T> {
        return mutableListOf<T>().also { it.addAll(this) }
    }
}