/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/isomorphic-strings/
 * 
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while preserving the order of characters. 
 * No two characters may map to the same character, but a character may map to itself.
 * 
 * Даны две строки s и t, определите являются ли они изоморфными. 
 * Две строки считаются изоморфными по отношению друг к другу, если все символы могут быть заменены символами из t и мы получим строку t. 
 * Все символы из одной строки могут быть заменены символвами другой строки, так что одному символу соответствует один символ из другой строки, 
 * но одному символу не может соответствовать несколько символов. 
 * Символ одной строки может совпадать с символом другой строки. Пример egg - add.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= s.length <= 5 * 10^4
 * - t.length == s.length
 * - s and t consist of any valid ascii character.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 64,39%
 * Memory beats 48,99%
 * 
 * Telegram: https://t.me/c/2225351477/61
 */
class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if(s =="" && t == "") return false

        var dictionary: MutableMap<Char, Char> = mutableMapOf()
        val uniqueSet: MutableSet<Char> = mutableSetOf<Char>()

        s.forEachIndexed { index, char ->
            if(!uniqueSet.contains(t[index])) {
                dictionary[char] = t[index]
                uniqueSet.add(t[index])
            }
        }

        s.forEachIndexed { index, char ->
            if(dictionary[char] != t[index]) return false
        }

        return true
    }
}