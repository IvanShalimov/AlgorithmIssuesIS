/**
 *
 * Issue/Проблема: https://leetcode.com/problems/number-of-segments-in-a-string/
 * 
 * Given a string s, return the number of segments in the string.
 * 
 * A segment is defined to be a contiguous sequence of non-space characters.
 * 
 * Constraints/Ограничения:
 * 
 * - 0 <= s.length <= 300
 * - s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
 * - The only space character in s is ' '.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 41,03% O(N) 
 * Memory beats 25,64% O(N)
 * 
 * Telegram: https://t.me/c/2225351477/112
 */
class Solution {
    fun countSegments(s: String) = s.split("\\s+".toRegex()).filter{it.isNotBlank()}.size
}