/**
 *
 * Issue/Проблема: leetcode.com/problems/reverse-string/
 * 
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * 
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Дана строка в форме массива символов. Переверните ее не прибегая к выделению дополнительной памяти(in-place). 
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= s.length <= 10^5
 * - s[i] is a printable ascii character.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 97,05% O(N) 
 * Memory beats 50,91% O(1)
 * 
 * Telegram: https://t.me/c/2225351477/98
 */
class Solution {
    fun reverseString(s: CharArray): Unit {
        var first = 0
        var last = s.size-1
        while( first < last) {
            val temp = s[last]
            s[last] = s[first]
            s[first] = temp
            first++
            last--
        }
    }
}