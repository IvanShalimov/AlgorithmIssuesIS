/**
 * Source/Исчтоник: https://leetcode.com/problems/climbing-stairs/
 * Issue/Проблема:
 * 
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Есть лестница с n-количеством ступеней. За раз вы можете преодолеть 1 или 2  ступени. 
 * Сколько возможных вариантов подъема по заданной лестнице существует? Ограничения: количество ступеней может быть от 1 до 45.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= n <= 45
 * 
 * Score solution/Оценка решения:
 * Runtime beats 96,45%
 * Memory beats 26,53%
 * 
 * Telegram: https://t.me/c/2225351477/19
 */
class Solution {
    fun climbStairs(n: Int): Int {
        if(n == 1) return 1
        var n0 = 0
        var n1 = 1
        var index = 1
        while(index <= n) {
            val n2 = n0 + n1
            n0 = n1
            n1 = n2
            index++
        }
        return n1
    }
}