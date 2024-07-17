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
 * Issue/Проблема: https://leetcode.com/problems/invert-binary-tree/description/
 * 
 * Given the root of a binary tree, invert the tree, and return its root.
 * 
 * Дан корень root бинарного дерева, разверните его и верните корень.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [0, 100].
 * - -100 <= Node.val <= 100
 * 
 * Score solution/Оценка решения:
 * Runtime beats 54,27% O(N)
 * Memory beats 67,67% O(N)
 * 
 * https://t.me/c/2225351477/72
 */
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        //base
        if(root == null) return null
        //swap
        val temp = invertTree(root?.right)
        root?.right = invertTree(root?.left)
        root?.left = temp
        // result
        return root
    }
}