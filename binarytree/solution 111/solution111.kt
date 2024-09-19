/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/binary-tree-tilt/
 * 
 * Given the root of a binary tree, return the sum of every tree node's tilt.
 * 
 * The tilt of a tree node is the absolute difference between the sum of all left subtree node values and all right subtree node values. 
 * If a node does not have a left child, then the sum of the left subtree node values is treated as 0. 
 * The rule is similar if the node does not have a right child.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [0, 10^4].
 * - -1000 <= Node.val <= 1000
 * 
 * Score solution/Оценка решения:
 * Runtime beats 40,00% O(N) 
 * Memory beats 20,00% O(N)
 * 
 * TG: https://t.me/c/2225351477/124
 */
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun findTilt(root: TreeNode?): Int {
        val list = ArrayList<Int>()
        helper(root, list)
        return list.sum()
    }

        private fun helper(root: TreeNode?, list: ArrayList<Int>) {
        var leftSubtreeSum = 0
        var rightSubtreeSum = 0
        if (root?.left != null) {
            leftSubtreeSum = sumOfAllElements(root.left!!)
        }
        if (root?.right != null) {
            rightSubtreeSum = sumOfAllElements(root.right!!)
        }
        list.add(abs(leftSubtreeSum - rightSubtreeSum))
        if (root != null) {
            helper(root.right, list)
        }
        if (root != null) {
            helper(root.left, list)
        }
    }

    private fun sumOfAllElements(root: TreeNode): Int {
        var sum = 0
        sum += root.`val`
        if (root.left != null) {
            sum += sumOfAllElements(root.left!!)
        }
        if (root.right != null) {
            sum += sumOfAllElements(root.right!!)
        }
        return sum
    }
}