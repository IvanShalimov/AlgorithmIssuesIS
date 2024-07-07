/**
 * 
 * Source/Исчтоник: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 * Issue/Проблема:
 * 
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * Даны две строки needle и haystack, верните индекс первого появления needle в haystack, или -1 если needle не часть haystack.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= haystack.length, needle.length <= 104
 * - haystack and needle consist of only lowercase English characters.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 61,54%
 * Memory beats 10,37%
 * 
 * Telegram: -
 */
class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val result = haystack.indexOf(needle, 0, true)
        return result
    }
}