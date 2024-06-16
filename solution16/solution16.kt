/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 *
 * Source/Исчтоник: https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/1289941589/
 * Issue/Проблема:
 * 
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * Дан сортированный связанный список (его первый элемент). Необходимо удалить все повторяющиеся элементы и вернуть список обратно. Сортировка должна сохраниться.
 * 
 * Constraints/Ограничения:
 *
 * - The number of nodes in the list is in the range [0, 300].
 * - -100 <= Node.val <= 100
 * - The list is guaranteed to be sorted in ascending order.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 12,91%
 * Memory beats 94,29%
 * 
 * Telegram: https://t.me/c/2225351477/20
 */
class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if(head == null || head.next == null) return head
        return head?.let{ 
            var previous = it
            var current = it.next
            do {
                if(previous.`val` == current.`val`) {
                    current = current.next
                    previous.next = current
                } else {
                    previous = current
                    current = current.next
                }
            } while (current != null)
            it
        } ?: head 
    }
}