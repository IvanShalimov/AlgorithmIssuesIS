/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/palindrome-number/
 * 
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * 
 * -
 * 
 * Constraints/Ограничения:
 * 
 * - -2^31 <= x <= 2^31 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 53,94%
 * Memory beats 95,97%
 * 
 * Telegram: -
 */
class Solution {
    fun isPalindrome(x: Int): Boolean {
        if(x<0) return false
        val reverseDigits = mutableListOf<Int>()
        var temp = x
        while(temp > 0) {
            reverseDigits.add(temp%10)
            temp = temp/10
        }
        return reverseDigits == reverseDigits.asReversed()
    }
}