/**
 * 
 * https://leetcode.com/problems/longest-common-prefix/
 * Issue/Проблема:
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * -
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= strs.length <= 200
 * - 0 <= strs[i].length <= 200
 * - strs[i] consists of only lowercase English letters.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 5,02%
 * Memory beats 5,96%
 * 
 * Telegram: -
 */
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val lengthComparator = Comparator { str1: String, str2: String -> str1.length - str2.length }
        val list = strs.toList().sortedWith(lengthComparator)
    
        var breaked = true
        var index = -1
    
        while(breaked && index < list[0].length) {
            index++
            for(listIndex in 1..list.size-1) {
                if (list[listIndex].get(index) != list[0].get(index)) {
                    breaked = false
                }
            }
        }
    
        return list[0].substring(0,index)
    }
}