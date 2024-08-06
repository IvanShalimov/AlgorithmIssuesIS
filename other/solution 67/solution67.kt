/**
 *
 * Issue/Проблема: https://leetcode.com/problems/reverse-vowels-of-a-string/
 * 
 * Given a string s, reverse only all the vowels in the string and return it.
 * 
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * 
 * Дана строка s, поменяйте местами только гласные и верните результат. За гласные считаются 'a', 'e', 'i', 'o', и 'u' в верхнем и нижнем регистрах. 
 * Могут появляться более чем один раз.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= s.length <= 3 * 105
 * - s consist of printable ASCII characters.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 62,43% O(N) 
 * Memory beats 64,51% O(N)
 * 
 * Telegram: https://t.me/c/2225351477/100
 */
class Solution {
    fun reverseVowels(s: String): String {
        val charsString = s.toCharArray()
        var first = 0
        var last = s.length-1
        val vowels = setOf('a','e','i','o','u','A','E','I','O','U')
        while (first < last) {
            val isFirstVowel = vowels.contains(charsString[first])
            val isLastVowel = vowels.contains(charsString[last])

            if(!isFirstVowel) first++
            if(!isLastVowel) last--

            if(isFirstVowel && isLastVowel) {
                val temp = charsString[last]
                charsString[last] = charsString[first]
                charsString[first] = temp
                first++
                last--
            }
        }
        return String(charsString)
    }
}