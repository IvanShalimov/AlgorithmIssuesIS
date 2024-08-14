/**
 *
 * Issue/Проблема: https://leetcode.com/problems/is-subsequence/
 * 
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * 
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) 
 * of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * 
 * Constraints/Ограничения:
 * 
 * - 0 <= s.length <= 100
 * - 0 <= t.length <= 10^4
 * - s and t consist only of lowercase English letters.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 28,78% O(N) 
 * Memory beats 97,73% O(1)
 * 
 * Telegram: https://t.me/c/2225351477/108
 */
class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var curIndex = 0
        t.forEachIndexed { index, char ->
            if (curIndex >= s.length) return true
            if(char == s[curIndex]) curIndex++    
        }

        if (curIndex >= s.length) return true
        
        return false
    }
}