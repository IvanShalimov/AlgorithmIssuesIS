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
 * Issue/Проблема: https://leetcode.com/problems/diameter-of-binary-tree/
 * 
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * 
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 * 
 * The length of a path between two nodes is represented by the number of edges between them.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [1, 10^4].
 * - -100 <= Node.val <= 100
 * 
 * Score solution/Оценка решения:
 * Runtime beats 16,89% O(N) 
 * Memory beats 37,53% O(N)
 * 
 * TG: https://t.me/c/2225351477/121
 */
class Solution {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if (root == null) return 0

        val stack = Stack<Pair<TreeNode, Boolean>>() // Pair of node and whether it's processed
        val depths = mutableMapOf<TreeNode?, Int>() // Store depths of nodes
        var diameter = 0

        stack.push(root to false)

        while (stack.isNotEmpty()) {
            val (node, processed) = stack.pop()

            if (processed) {
                val leftDepth = depths.getOrDefault(node.left, 0)
                val rightDepth = depths.getOrDefault(node.right, 0)
                diameter = maxOf(diameter, leftDepth + rightDepth)
                depths[node] = 1 + maxOf(leftDepth, rightDepth)
            } else {
                stack.push(node to true)
                node.right?.let { stack.push(it to false) }
                node.left?.let { stack.push(it to false) }
            }
        }

        return diameter  
    }
}