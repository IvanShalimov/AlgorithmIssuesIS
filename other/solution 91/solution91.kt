/**
 *
 * Issue/Проблема: https://leetcode.com/problems/license-key-formatting/
 * 
 * You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. 
 * The string is separated into n + 1 groups by n dashes. You are also given an integer k.
 * 
 * We want to reformat the string s such that each group contains exactly k characters, except for the first group, which 
 * could be shorter than k but still must contain at least one character. 
 * Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.
 * 
 * Return the reformatted license key
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= s.length <= 10^5
 * - s consists of English letters, digits, and dashes '-'.
 * - 1 <= k <= 10^4
 * 
 * Score solution/Оценка решения:
 * Runtime beats 100,00% O(N) 
 * Memory beats 46,12% O(N)
 * 
 * https://t.me/c/2225351477/115
 */
class Solution {
    fun licenseKeyFormatting(s: String, k: Int): String {
        var result = StringBuilder()
        
        for (i in s.length-1 downTo 0) {
            if (s[i] == '-') continue
            if (result.length % (k + 1) == k) result.append('-')
            result.append(s[i].toUpperCase())
        }
        
        return result.reverse().toString()
    }
}