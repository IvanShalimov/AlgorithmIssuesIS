/**
 *
 * Issue/Проблема: https://leetcode.com/problems/word-pattern/
 * 
 * Given a pattern and a string s, find if s follows the same pattern.
 * 
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * 
 *  Дан паттерн pattern и строка s. Определите следует ли строка паттерну. Пример (паттерн: abba строка: dog cat cat dog  Результат: true)
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= pattern.length <= 300
 * - pattern contains only lower-case English letters.
 * - 1 <= s.length <= 3000
 * - s contains only lowercase English letters and spaces ' '.
 * - s does not contain any leading or trailing spaces.
 * - All the words in s are separated by a single space.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 41,00% (O(N))
 * Memory beats 36,43% (O(N))
 * 
 * Telegram: https://t.me/c/2225351477/91
 */
class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val keys = pattern.toCharArray()
        val values = s.split(" ")

        if(values.size != keys.size) return false

        val dictionaryKyes: MutableMap<Char, String> = mutableMapOf()
        val dictionaryValues: MutableMap<String, Char> = mutableMapOf()

        keys.forEachIndexed { index, key ->  
            if(!dictionaryKyes.contains(key) && !dictionaryValues.contains(values[index])) {
                dictionaryKyes[key] = values[index]
                dictionaryValues[values[index]] = key
            } else {
                if(dictionaryKyes[key] != values[index] || dictionaryValues[values[index]] != key) {
                    return false
                }
            }
        }

        return true
    }
}