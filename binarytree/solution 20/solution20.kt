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
 * Source/Исчтоник: https://leetcode.com/problems/symmetric-tree/
 * Issue/Проблема:
 * 
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * Дан корень бинарного дерева root. Проверить, что дерево симметрично относительно центра., т.е. левое поддерево корня зеркальное отражение правого поддерева.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [1, 1000].
 * - -100 <= Node.val <= 100
 * 
 * Score solution/Оценка решения:
 * Runtime beats 57,51%
 * Memory beats 47,34%
 * 
 * Telegram: https://t.me/c/2225351477/25
 */
class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == q) return true
        if (p == null || q == null || p.`val` != q.`val`) return false
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }
}