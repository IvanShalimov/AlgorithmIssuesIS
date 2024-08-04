/**
 *
 * Issue/Проблема: https://leetcode.com/problems/power-of-four/
 * 
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 * 
 * An integer n is a power of four, if there exists an integer x such that n == 4x.
 * 
 * Дано целое число n. Верните true если оно является степенью четверки, в противном случае верните false.
 * 
 * Constraints/Ограничения:
 * 
 * - -2^31 <= n <= 2^31 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 34,55% O(LogN) 
 * Memory beats 30,91% O(1)
 * 
 * Telegram: https://t.me/c/2225351477/96
 */
 My solution:

class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        var manN = n
        while(manN>0) {
            if (manN==1) return true
            if(manN%4 != 0) return false
            manN = manN/4
        }
        return false
    }
}

Best solution(O(1)-O(1)):

class Solution {
    fun isPowerOfFour(n: Int): Boolean = n > 0  // verify if the number is negative
            && n and (n - 1) == 0     // ensure that there is only a single bit present
            && n and 0x5555_5555 == n  // verify the fourth power of the check bit
}