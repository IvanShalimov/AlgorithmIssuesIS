/**
 * 
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * Issue/Проблема:
 * 
 * You are given the heads of two sorted linked lists list1 and list2.
 * 
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * 
 * Return the head of the merged linked list.
 * 
 * -
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in both lists is in the range [0, 50].
 * - -100 <= Node.val <= 100
 * - Both list1 and list2 are sorted in non-decreasing order.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 41,85%
 * Memory beats 65,17%
 * 
 * Telegram: -
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var nodeOne = list1!!
        var nodeTwo = list2!!
        var resultHead: ListNode? = null
        var result: ListNode? = null

        while(nodeOne.next != null && nodeTwo.next != null) {
            if (nodeOne.`val` >= nodeTwo.`val`) {
                    if(resultHead == null) { 
                        resultHead =  nodeTwo
                        result = resultHead
                    } else {
                        result!!.next = nodeTwo
                        result = nodeTwo
                    } 
                nodeTwo = nodeTwo.next
            } else {
                    if(resultHead == null) { 
                        resultHead =  nodeOne 
                        result = resultHead
                    } else {
                        result!!.next = nodeOne
                        result = nodeOne
                    } 
                nodeOne = nodeOne.next
            }
        }

        while(nodeOne.next != null) {
            result!!.next = nodeOne
        }

        while(nodeTwo.next != null) {
            result!!.next = nodeTwo
        }

        return if (resultHead == null) ListNode() else resultHead
    }
}