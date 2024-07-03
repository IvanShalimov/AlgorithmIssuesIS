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
 * Source/Исчтоник: https://leetcode.com/problems/binary-tree-postorder-traversal/
 * Issue/Проблема:
 * 
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 * 
 * Дан корень бинарного дерева, верните результат postorder-обхода в виде с писка.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of the nodes in the tree is in the range [0, 100].
 * - -100 <= Node.val <= 100
 * 
 * Score solution/Оценка решения:
 * Runtime beats 82,43%
 * Memory beats 29,73%
 * 
 * Telegram: https://t.me/c/2225351477/41
 */
class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        if(root == null) return emptyList()
        var result = mutableListOf<Int>()
        
        result += postorderTraversal(root.left)
        result += postorderTraversal(root.right)
        result.add(root.`val`)
        return result
    }
}