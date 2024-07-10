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
 * Issue/Проблема: https://leetcode.com/problems/remove-linked-list-elements/
 * 
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 * 
 * Дана голова head связанного списка и целое число val. Удалите все узлы чье значение равно val и верните новую голову.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the list is in the range [0, 10^4].
 * - 1 <= Node.val <= 50
 * - 0 <= val <= 50
 * 
 * Score solution/Оценка решения:
 * Runtime beats 22,98%
 * Memory beats 23,60%
 * 
 * Telegram: https://t.me/c/2225351477/53
 */
class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        val root = ListNode(-1).apply { next = head }
        var node = root

        while (node.next != null) {
            if (node.next.`val` == `val`) {
                node.next = node.next?.next
                continue
            }
            node = node.next
        }

        return root.next
    }
}