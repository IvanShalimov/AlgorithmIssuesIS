/**
 *
 * Issue/Проблема: https://leetcode.com/problems/ransom-note/
 * 
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * 
 * Each letter in magazine can only be used once in ransomNote.
 * 
 * Даны две строки ransomNote и magazine, верните true если ransomNote может быть сконструировано из букв magazine иначе false.
 * 
 * Каждая буква из  magazine может быть использована лишь единожды в ransomNote.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= ransomNote.length, magazine.length <= 10^5
 * - ransomNote and magazine consist of lowercase English letters.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 22,44% O(N+M) 
 * Memory beats 54,23% O(M)
 * 
 * Telegram: https://t.me/c/2225351477/106
 */
class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val symbols: MutableMap<Char, Int> = transforMagaziteToMap(magazine)
        ransomNote.forEach {
            val temp = symbols[it] ?: 0
            if(!symbols.contains(it)) return false
            if(temp <= 0) return false
            symbols[it] = temp - 1
        }
        return true
    }

    private fun transforMagaziteToMap(magazine: String): MutableMap<Char, Int> {
        return mutableMapOf<Char, Int>().apply {
            magazine.forEach {
                if(this.contains(it)) {
                    val temp = this[it] ?: 0 
                    this[it] = temp + 1
                } else {
                    this[it] = 1
                }
            }
        }
    }
}