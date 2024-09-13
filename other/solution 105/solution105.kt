/**
 *
 * Issue/Проблема: https://leetcode.com/problems/reverse-string-ii/
 * 
 * Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
 * 
 * If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, 
 * then reverse the first k characters and leave the other as original.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= s.length <= 10^4
 * - s consists of only lowercase English letters.
 * - 1 <= k <= 10^4
 * 
 * Score solution/Оценка решения:
 * Runtime beats 40,91% O(N) 
 * Memory beats 13,64% O(N)
 * 
 * TG:https://t.me/c/2225351477/120
 */
class Solution {
    fun reverseStr(s: String, k: Int): String {
        return s.chunked(k).mapIndexed { index, str -> if (index % 2 == 0) str.reversed() else str }.joinToString("")
    }
}