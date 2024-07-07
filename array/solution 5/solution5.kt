/**
 * 
 * https://leetcode.com/problems/valid-parentheses/
 * Issue/Проблема:
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 * -
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= s.length <= 10^4
 * - s consists of parentheses only '()[]{}'.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 81,24%
 * Memory beats 79,24%
 * 
 * Telegram: -
 */
import java.util.Stack

class Solution {
val dictionary = mapOf<String, String>(
    "(" to ")",
    ")" to "(",
    "[" to "]",
    "]" to "[",
    "{" to "}",
    "}" to "{",
    )

    val openSet = setOf("(","[","{")
    val closeSet = setOf(")","]","}")

    fun isValid(s: String): Boolean {
        var stack = Stack<String>()
        s.forEach { char ->
            var cahrString = char.toString()
            when {
                openSet.contains(cahrString) -> {
                    stack.push(dictionary[cahrString])
                }
                closeSet.contains(cahrString) -> {
                    if(stack.peek() == cahrString) {
                        stack.pop()
                    }
                }
            }
        }

        return stack.isEmpty()
    }
}