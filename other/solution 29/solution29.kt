/**
 * Source/Исчтоник: https://leetcode.com/problems/valid-palindrome/
 * Issue/Проблема:
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Фраза считается палиндромом, если после приведения всех символов в нижний регистр и удаления из нее всех не число-буквенных символов, 
 * при чтении  задом наперед мы получаем тоже слово. Вернуть true если фраза является палиндромом, и false если нет.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= s.length <= 2 * 10^5
 * - s consists only of printable ASCII characters.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 16,76%
 * Memory beats 14,87%
 * 
 * Telegram: https://t.me/c/2225351477/34
 */
class Solution {
    fun isPalindrome(s: String): Boolean {
        val result = Regex("[^A-Za-z0-9 ]").replace(s.toLowerCase(),"").replace(" ", "")
        return result == result.reversed()
    }
}