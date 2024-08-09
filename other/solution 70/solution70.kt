/**
 *
 * Issue/Проблема: https://leetcode.com/problems/valid-perfect-square/
 * 
 * Given a positive integer num, return true if num is a perfect square or false otherwise.
 * 
 * A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
 * 
 * You must not use any built-in library function, such as sqrt.
 * 
 * Дано положительное целое число. Верните true если это идеальный квадрат, иначе верните false. 
 * Число считается идеальным квадратом в том случае если извлечение его квадратного корня как результат дает положительное целое число.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= num <= 2^31 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 70,21% O(logN) 
 * Memory beats 34,04% O(1)
 * 
 * Telegram: https://t.me/c/2225351477/104
 */
class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var start = 0L
        var end = num.toLong()
        while (start <= end) {
            val mid = start + (end - start) / 2
            when {
                mid * mid > num -> {
                    end = mid - 1
                }
                mid * mid < num -> {
                    start = mid + 1
                }
                else -> return true
            }
        }
        return false
    }
}