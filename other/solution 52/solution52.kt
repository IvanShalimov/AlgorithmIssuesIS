/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/valid-anagram/
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * 
 * Даны две строки s и t, верните true если они являются анаграммами, в обратном случае верните false.
 * 
 * Анагра́мма — литературный приём, состоящий в перестановке букв или звуков определённого слова, что в результате даёт другое слово или словосочетание.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= s.length, t.length <= 5 * 10^4
 * - s and t consist of lowercase English letters.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 12,69%
 * Memory beats 12,61%
 * 
 * https://t.me/c/2225351477/78
 */
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length > t.length || s.length < t.length) return false

        val sSorted = s.toCharArray().sorted()
        val tSorted = t.toCharArray().sorted()

        sSorted.forEachIndexed {index, value ->
            if(value != tSorted[index]) return false
        }

        return true
    }
}