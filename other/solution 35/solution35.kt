/**
 * 
 * 
 * Source/Исчтоник: https://leetcode.com/problems/excel-sheet-column-title/description/
 * Issue/Проблема:
 * 
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 * 
 * Дано целое число columnNumber, верните номер столбца соответственно Excel таблице(пример по ссылке).
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= columnNumber <= 231 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 16,67%
 * Memory beats 65,62%
 * 
 * Telegram: https://t.me/c/2225351477/43
 */
class Solution {
    val base = 'Z' - 'A' + 1

    fun convertToTitle(columnNumber: Int): String {
        var number = columnNumber
        return buildString{
            while(number > 0){
                var collumnsInSuffix = (number - 1) % base + 1;
                insert(0,'A' + collumnsInSuffix-1)
                number = (number - collumnsInSuffix) / base
            }
        }
    }
}