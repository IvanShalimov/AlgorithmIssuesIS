/**
 * Source/Исчтоник: https://leetcode.com/problems/sqrtx/description/
 * Issue/Проблема:
 * 
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * 
 * You must not use any built-in exponent function or operator.
 * 
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * 
 * Дано целое положительное число x.  Верните квадратный корень числа в виде целого положительного числа. 
 * 
 * Не прибегайте к библиотечным функциям вычисления квадратного корня.
 * 
 * Constraints/Ограничения:
 * 
 * - 0 <= x <= 2^31 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 86,43%
 * Memory beats 93,89%
 * 
 * Telegram: https://t.me/c/2225351477/18
 */
class Solution {
    fun mySqrt(x: Int): Int {
        if(x>0 && x<4) return 1
        var squareRoot = (x/2).toDouble()
        var temp:Double = squareRoot
        do {
            temp = squareRoot
            squareRoot = (temp + (x/temp))/2
        } while((temp - squareRoot) > 0)
        return Math.abs(squareRoot).toInt()
    }
}