/**
 * 
 * https://leetcode.com/problems/roman-to-integer/
 * Issue/Проблема:
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * 
 * Symbol       Value
 *  I             1
 *  V             5
 *  X             10
 *  L             50
 *  C             100
 *  D             500
 *  M             1000
 * 
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. 
 * The number 27 is written as XXVII, which is XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * 
 * -
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= s.length <= 15
 * - s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * - It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 * 
 * Score solution/Оценка решения:
 * Runtime beats 5,20%
 * Memory beats 100,00%
 * 
 * Telegram: -
 */
class Solution {
    fun romanToInt(s: String): Int {
        val signs = mapOf<String, Int>(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )
        val tempString = s.reversed()
        var result = 0
        var lastChar: String = "-"


        tempString.forEach {char ->
        var key = char.toString()
        val b = signs[lastChar] ?: 0
        val a = signs[key] ?: 0
            if(lastChar != "-" && b > a) {
                result -= signs[key] ?: 0
            } else {
                result += signs[key] ?: 0
            }
            lastChar = key
        }

        return result
    }
}