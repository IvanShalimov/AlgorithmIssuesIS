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
 * Issue/Проблема: https://leetcode.com/problems/count-complete-tree-nodes/
 * 
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 * 
 * According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, 
 * and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 * Design an algorithm that runs in less than O(n) time complexity.
 * 
 * Дан корень root полного(complete) бинарного дерева. Верните количество узлов в нем.
 * 
 * Согласно Википедии, каждый уровень, за исключением, возможно, последнего, полностью заполнен полным двоичным деревом, 
 * и все узлы на последнем уровне расположены максимально слева. Он может иметь от 1 до 2^h узлов включительно на последнем уровне h.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [0, 5 * 10^4].
 * - 0 <= Node.val <= 5 * 10^4
 * - The tree is guaranteed to be complete.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 97,22%
 * Memory beats 34,03%
 * 
 * https://t.me/c/2225351477/67
 */
class Solution {
    fun countNodes(root: TreeNode?): Int {
        if(root == null) return 0
        return countNodes(root.left) + countNodes(root.right) + 1
    }
}