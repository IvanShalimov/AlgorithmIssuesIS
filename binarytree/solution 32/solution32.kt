/**
 * 
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 * 
 * Source/Исчтоник: https://leetcode.com/problems/binary-tree-preorder-traversal/
 * Issue/Проблема:
 * 
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * 
 * Дан корень root бинарного дерева, верните список-результат preorder-обхода дерева.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [0, 100].
 * - -100 <= Node.val <= 100
 * 
 * Score solution/Оценка решения:
 * Runtime beats 14,14%
 * Memory beats 30,30%
 * 
 * Telegram: https://t.me/c/2225351477/37
 */
class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if(root == null) return emptyList()
        var result = mutableListOf<Int>()
        
        result.add(root.`val`)
        result += traversal(root.left)
        result += traversal(root.right)
        return result
    }

    private fun traversal(root: TreeNode?): List<Int> {
        if(root == null) return emptyList()

        var result = mutableListOf<Int>()

        result.add(root.`val`)
        result += traversal(root.left)
        result += traversal(root.right)
        
        return result
    }
}