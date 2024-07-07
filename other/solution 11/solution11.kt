/**
 * Source/Исчтоник: https://leetcode.com/problems/length-of-last-word/
 * Issue/Проблема:
 * 
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Дана строка s, которая состоит из слов и пробелов. Необходимо вернуть размер последнего слова в строке. 
 * Строка состоит из пробелов и английских букв. Пробелов может быть несколько. В строке будет хотя бы одно слово.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= s.length <= 104
 * - s consists of only English letters and spaces ' '.
 * - There will be at least one word in s.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 27,51%
 * Memory beats 90,55%
 * 
 * Telegram: https://t.me/c/2225351477/14
 */
class Solution {
    fun lengthOfLastWord(s: String): Int {
        var counter = 0
        var lastChar = '&'

        s.forEachIndexed { index, char -> 
            when {
                lastChar == ' ' && char != ' ' -> {
                    counter = 0
                    counter++
                }
                lastChar != ' ' && char == ' ' -> {}
                lastChar != ' ' && char != ' ' -> {
                    counter++
                }

            }
            
            lastChar = char
        }
        return counter
    }
}