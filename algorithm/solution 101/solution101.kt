/**
 *
 * Issue/Проблема: https://leetcode.com/problems/fibonacci-number/
 * 
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the 
 * two preceding ones, starting from 0 and 1. That is,
 * 
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 * 
 * Constraints/Ограничения:
 * 
 * - 0 <= n <= 30
 * 
 * Score solution/Оценка решения:
 * Runtime beats 70,50% O(2^N) 
 * Memory beats 43,17% O(N)
 * 
 * TG: https://t.me/c/2225351477/119
 */
class Solution {
    fun fib(n: Int): Int {
        if (n == 1) return 1
        if (n == 0) return 0
        return fib(n-1)+fib(n-2)
    }
}