/**
 * Source/Исчтоник: https://leetcode.com/problems/pascals-triangle/
 * Issue/Проблема:
 * 
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * 
 * Дано целое число numRows, от 1 до 100, верните numRows строк треугольника Паскаля.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= numRows <= 30
 * 
 * Score solution/Оценка решения:
 * Runtime beats 75,27%
 * Memory beats 76,34%
 * 
 * Telegram: https://t.me/c/2225351477/31
 */
class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        for(i in 0..numRows-1) {
            val item = MutableList<Int>(i+1) {1}
            result.add(item)
            for(j in 0..item.size-1) {
                if(j == 0 || j == item.size-1) {
                    item[j] = 1
                    continue
                }
                if(i-1 < 0) continue

                item[j] = result[i-1][j-1] + result[i-1][j]
            }
        }

        return result
    }
}