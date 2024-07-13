/**
 * 
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 * 
 * Issue/Проблема: https://leetcode.com/problems/reverse-linked-list/
 * 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 
 * Дана голова head односвязного списка, верните его в обратно порядке.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the list is the range [0, 5000].
 * - -5000 <= Node.val <= 5000
 * 
 * Score solution/Оценка решения:
 * Runtime beats 94,78%
 * Memory beats 21,29%
 * 
 * Telegram: https://t.me/c/2225351477/62
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var cur: ListNode? = head
        var fast: ListNode? = head?.next
        cur?.next = null

        while (fast != null) {
            val temp = fast?.next
            fast?.next = cur
            cur = fast
            fast = temp
        } 

        return cur
    }
}