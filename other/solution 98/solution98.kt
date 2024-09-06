/**
 *
 * Issue/Проблема: https://leetcode.com/problems/base-7/
 * 
 * Given an integer num, return a string of its base 7 representation.
 * 
 * Constraints/Ограничения:
 * 
 * - -10^7 <= num <= 10^7
 * 
 * Score solution/Оценка решения:
 * Runtime beats 40,63% O(logN) 
 * Memory beats 62,50% O(logN)
 * 
 * https://t.me/c/2225351477/118
 */
class Solution {
    fun convertToBase7(num: Int): String {
        if(num == 0) return "0"
        var number = if(num < 0) -num else num
        val numOnBase7 = StringBuilder()
        while(number != 0) {
            numOnBase7.insert(0, number % 7)
            number /= 7
        }
        if(num < 0) numOnBase7.insert(0, '-')
        return numOnBase7.toString()
    }
}