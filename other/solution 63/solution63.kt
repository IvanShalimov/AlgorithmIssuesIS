/**
 *
 * Issue/Проблема: https://leetcode.com/problems/power-of-three/
 * 
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * 
 * An integer n is a power of three, if there exists an integer x such that n == 3^x.
 * 
 * Дано число n, верните true если это степень тройки, иначе верните false.
 * 
 * Constraints/Ограничения:
 * 
 * - -2^31 <= n <= 2^31 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 54,17% O(LogN) 
 * Memory beats 11,11% O(1)
 * 
 * Telegram: https://t.me/c/2225351477/94
 */
 My solution:

class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        var manN = n
        while(manN>0) {
            if (manN==1) return true
            if(manN%3 != 0) return false
            manN = manN/3
        }
        return false
    }
}

Best solution(O(1)):

const val THREE_POW_19 = 1_162_261_467

class Solution {
    fun isPowerOfThree(n: Int): Boolean = n > 0 && THREE_POW_19 % n == 0
}