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
 * Source/Исчтоник: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Issue/Проблема:
 * 
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * Дан корень дерева root , верните максимальную глубину дерева. Максимальная глубина это количество шагов от корня дерева до самого дальнего листа. 
 * Допустим у корня есть левый и правый узел. У правого узла нету потомков. А у левого узла есть один левый потомок. 
 * Последний потомок-лист достигается за два шага, а значит глубина дерева - 2.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [0, 10^4].
 * - -100 <= Node.val <= 100
 * 
 * Score solution/Оценка решения:
 * Runtime beats 60,91%
 * Memory beats 23,61%
 * 
 * Telegram: https://t.me/c/2225351477/26
 */
class Solution {

    fun maxDepth(root: TreeNode?): Int {
        return nodesTraversal(root, 0)
    }

    fun nodesTraversal(root: TreeNode?, depth: Int): Int {
        if(root == null) return depth
        val left = nodesTraversal(root.left, depth+1)
        val right = nodesTraversal(root.right, depth+1)
        
        if(left > right) {
            return left
        } else {
            return right
        }
    }
}