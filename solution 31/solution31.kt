/**
 * Source/Исчтоник: https://leetcode.com/problems/linked-list-cycle/
 * Issue/Проблема:
 * 
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * 
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * 
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * 
 * Дана голова head связанного списка. Определите есть ли в нем цикл. Цикл это такая ситуация, когда элемент ссылается на один из предыдущих 
 * в череде элементов, как результат мы не сможем выйти из цикла-обхода.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of the nodes in the list is in the range [0, 10^4].
 * - -10^5 <= Node.val <= 10^5
 * - pos is -1 or a valid index in the linked-list.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 64,11%
 * Memory beats 31,52%
 * 
 * Telegram: https://t.me/c/2225351477/36
 */
class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head?.next

        while(fast != null && slow != fast) {
            slow = slow!!.next
            fast = fast!!.next?.next
        }
        return fast != null
    }
}