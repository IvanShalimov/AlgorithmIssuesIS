/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/happy-number/
 * 
 * Write an algorithm to determine if a number n is happy.
 * 
 * A happy number is a number defined by the following process:
 * 
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * 
 * Return true if n is a happy number, and false if not.
 * 
 * Напишите алгоритм, определяющий что число n счастливое. Счастливый номер определяется через следующий процесс:
 * 
 * 1. Замените число суммой квадратов его цифр
 * 2. Повторяйте шаг 1 пока число не станет равно единице, в противном случае оно будет крутиться в бесконечном цикле
 * 3. Если удалось получить единицу, то это число счастливое
 * 
 * Верните true если число счастливое, и false если нет.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= n <= 2^31 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 86,14%
 * Memory beats 95,48%
 * 
 * Telegram: https://leetcode.com/problems/happy-number/
 */
class Solution {
    fun isHappy(n: Int): Boolean {
        var slow = n
        var fast = n
        do {
            slow = numSquareSum(slow)

            fast = numSquareSum(numSquareSum(fast))
        } while(slow != fast)

        return slow == 1
    }

    fun numSquareSum(number:Int):Int {
        var sum = 0
        var n = number
        while(n != 0) {
            sum += (n%10)*(n%10)
            n /= 10
        }
        return sum
    }
}