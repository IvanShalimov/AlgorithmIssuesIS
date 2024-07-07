/**
 * 
 * Source/Исчтоник: https://leetcode.com/problems/excel-sheet-column-number/
 * Issue/Проблема:
 * 
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
 * 
 * Дана строка columnTitle, которая репрезентует заголовок столбца в Excel-таблице. Верните соответствующей ей номер столбца.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= columnTitle.length <= 7
 * - columnTitle consists only of uppercase English letters.
 * - columnTitle is in the range ["A", "FXSHRXW"].
 * 
 * Score solution/Оценка решения:
 * Runtime beats 25,93%
 * Memory beats 46,91%
 * 
 * Telegram: https://t.me/c/2225351477/48
 */
class Solution {

    fun titleToNumber(columnTitle: String): Int {
        var power = 0
        var result =- 0
        for(index in columnTitle.length-1 downTo 0) {
            val element = (26 - ('Z' - columnTitle[index]))

            result = when(power) {
                0 -> { result + element * 1}
                1 -> { result + element * 26}
                else -> { result + element * 26.pow(power)}
            }

            power++
        }
        return result
    }

    private fun Int.pow(x: Int): Int = (2..x).fold(this) { r, _ -> r * this }
}