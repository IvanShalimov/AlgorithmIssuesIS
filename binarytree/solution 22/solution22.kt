/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 * 
 * Source/Исчтоник: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * Issue/Проблема:
 * 
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 * Дан целочисленный массив nums, отсортированный в возрастающем порядке. Верните высоко сбалансированное дерево.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 * - nums is sorted in a strictly increasing order.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 13,04%
 * Memory beats 12,65%
 * 
 * Telegram: https://t.me/c/2225351477/27
 */
class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if (nums.size == 0) return null
        if (nums.size == 1) return TreeNode(nums[0])
        
        val middleIndex = nums.size/2
        val node = TreeNode(nums[middleIndex])

        node.left = sortedArrayToBST(nums.copyOfRange(0, middleIndex))
        
        if(middleIndex+1 != nums.size) {
            node.right = sortedArrayToBST(nums.copyOfRange(middleIndex+1, nums.size))
        }

        return node
    }
}