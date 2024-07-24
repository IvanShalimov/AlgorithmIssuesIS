/**
 *
 * Issue/Проблема: https://leetcode.com/problems/add-digits/
 * 
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 * 
 * Дано целое число num, складывайте его цифры до тех пор, пока не получите однозначное число.
 * 
 * Hint: Read first paragraph/Читай первый параграф: https://en.wikipedia.org/wiki/Digital_root
 * 
 * Constraints/Ограничения:
 * 
 * - 0 <= num <= 2^31 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 53,19% (O(1))
 * Memory beats 62,77% (O(1))
 * 
 * https://t.me/c/2225351477/81
 */
class Solution {
    fun addDigits(num: Int): Int {
        if (num == 0) {
            return 0
        } else if (num % 9 == 0) {
            return 9
        } else return num % 9
    }
}