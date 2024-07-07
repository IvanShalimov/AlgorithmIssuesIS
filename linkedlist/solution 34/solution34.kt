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
 * Source/Исчтоник: https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Issue/Проблема:
 * 
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
 * If the two linked lists have no intersection at all, return null.
 * 
 * Даны начала двух связанных списков headA и headB, верните узел в котором они пересекаются. Если они не пересекаются, то верните null. 
 * В списках нету циклов, изменять структуру списков нельзя.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes of listA is in the m.
 * - The number of nodes of listB is in the n.
 * - 1 <= m, n <= 3 * 104
 * - 1 <= Node.val <= 105
 * - 0 <= skipA < m
 * - 0 <= skipB < n
 * - intersectVal is 0 if listA and listB do not intersect.
 * - intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 43,60%
 * Memory beats 94,31%
 * 
 * Telegram: https://t.me/c/2225351477/42
 */
class Solution {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        val map = HashMap<ListNode?, ListNode?>()

        var curA = headA
        var curB = headB

        while(curA != null) {
            map[curA] = curA
            curA = curA.next
        }

        while(curB != null) {
            if(map.contains(curB)) return curB
            curB = curB.next
        }

        return null
    }
}