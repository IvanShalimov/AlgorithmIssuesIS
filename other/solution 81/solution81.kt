/**
 *
 * Issue/Проблема: https://leetcode.com/problems/add-strings/
 * 
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 * 
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger). 
 * You must also not convert the inputs to integers directly.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= num1.length, num2.length <= 10^4
 * - num1 and num2 consist of only digits.
 * - num1 and num2 don't have any leading zeros except for the zero itself.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 82,78% O(MAX(M,N)) 
 * Memory beats 98,01% O(MAX(M,N))
 * 
 * Telegram: https://t.me/c/2225351477/111
 */
class Solution {
    fun addStrings(num1: String, num2: String): String {
        val (m, n) = Pair(num1.length, num2.length)
            var (i, j, sum, carry) = arrayOf(m-1, n-1, 0, 0) 
            val stringBuilder = StringBuilder()
            
            while (i >= 0 || j >= 0 || carry == 1) {
                sum = carry + if (i >= 0) num1[i] - '0' else 0
                sum += if (j >= 0) num2[j] - '0' else 0
                carry = sum / 10
                stringBuilder.append(sum % 10)
                i--; j--
            }
            return stringBuilder.reverse().toString()
    }
}