/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/power-of-two/
 * 
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * 
 * An integer n is a power of two, if there exists an integer x such that n == 2^x.
 * 
 * Дано целое число n, верните true если оно результат возведения двойки в степень. Иначе верните false.
 *
 * 
 * 
 * Constraints/Ограничения:
 * 
 * - -2^31 <= n <= 2^31 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 24,11% O(logN)
 * Memory beats 43,10% O(1)
 * 
 * Telegram: https://t.me/c/2225351477/74
 */
class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        var manN = n
        while(manN>0) {
            if (manN==1) return true
            if(manN%2 != 0) return false
            manN = manN/2
        }
        return false
    }
}