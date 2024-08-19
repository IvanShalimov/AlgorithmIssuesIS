/**
 *
 * Issue/Проблема: https://leetcode.com/problems/fizz-buzz//
 * 
 * Given an integer n, return a string array answer (1-indexed) where:package
 * 
 * - answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * - answer[i] == "Fizz" if i is divisible by 3.
 * - answer[i] == "Buzz" if i is divisible by 5.
 * - answer[i] == i (as a string) if none of the above conditions are true.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= n <= 10^4
 * 
 * Score solution/Оценка решения:
 * Runtime beats 30,41% O(N) 
 * Memory beats 5,75% O(N)
 * 
 * Telegram: https://t.me/c/2225351477/110
 */
class Solution {
    fun fizzBuzz(n: Int): List<String> {
        
        return buildList(n) {
            var r = 0
            
            while(r<n) {
                r++
                when {
                    r%3 == 0 && r%5 == 0 -> add("FizzBuzz")
                    r%3 == 0 && r%5 != 0 -> add("Fizz")
                    r%3 != 0 && r%5 == 0 -> add("Buzz")
                    else -> add("$r")
            }
            }

        }
    }
}