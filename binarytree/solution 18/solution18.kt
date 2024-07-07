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
 * Source/Исчтоник: https://leetcode.com/problems/binary-tree-inorder-traversal
 * Issue/Проблема:
 * 
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * Дан корень root бинарного дерева. Верните неупорядоченный результат обхода этого дерева.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [0, 100].
 * - -100 <= Node.val <= 100
 * 
 * Score solution/Оценка решения:
 * Runtime beats 5,29%
 * Memory beats 15,20%
 * 
 * Telegram: https://t.me/c/2225351477/23
 */
class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if(root == null) return emptyList()
        var result = mutableListOf<Int>()
        
        result += test(root.left)
        result.add(root.`val`)
        result += test(root.right)
        return result
    }

    fun test(root: TreeNode?): List<Int> {
        if(root == null) return emptyList()

        var result = mutableListOf<Int>()

        result += test(root.left)
        result.add(root.`val`)
        result += test(root.right)
        
        return result
    }
}