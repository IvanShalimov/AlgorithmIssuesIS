/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/palindrome-linked-list/
 * 
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 * 
 * Дана голова односвязного списка, верните true если этот список палиндром, иначе верните false.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the list is in the range [1, 10^5].
 * - 0 <= Node.val <= 9
 * 
 * Score solution/Оценка решения:
 * Runtime beats 85,20% O(N)
 * Memory beats 8,40% O(N)
 * 
 * Telegram: https://t.me/c/2225351477/77
 */
class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        // looking for a tail of linked list
        var tail: ListNode? = ListNode(head?.`val` ?: 0)
        var newHead = head?.next
        while (newHead != null) {
            val temp:ListNode? = ListNode(newHead.`val`)
            temp?.next = tail
            tail = temp
            newHead = newHead?.next
        }
        // compare two linked list
        newHead = head
        while (newHead != tail) {
            if(newHead?.`val` != tail?.`val`) {
                return false
            }
            newHead = newHead?.next
            tail = tail?.next
        }
        return true
    }
}