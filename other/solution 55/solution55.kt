/**
 *
 * Issue/Проблема: https://leetcode.com/problems/ugly-number/
 * 
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * 
 * Given an integer n, return true if n is an ugly number.
 * 
 * Уродливое число это такое число, которое делится только на 2,3 или 5. Верните true если число n уродливое.
 * 
 * Constraints/Ограничения:
 * 
 * - -2^31 <= n <= 2^31 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 91,43% (O(1))
 * Memory beats 55,71%
 * 
 * https://t.me/c/2225351477/83
 */
class Solution {
    fun isUgly(n: Int): Boolean {
        var num = n
        intArrayOf(2,3,5).forEach {
            while((num%it) == 0 && num != 0) num /= it
        }
 
        return num == 1
    }
}