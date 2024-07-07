/**
 * Source/Исчтоник: https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * Issue/Проблема:
 * 
 * Given a binary tree, find its minimum depth.
 * 
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Дано "бинарное дерево", найдите его минимум. 
 * 
 * Минимальная глубина дерева - это наименьшее количество узлов от корня до листа(лист это узел без дочерних узлов)
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [0, 105].
 * - -1000 <= Node.val <= 1000
 * 
 * Score solution/Оценка решения:
 * Runtime beats 43,99%
 * Memory beats 42,48%
 * 
 * Telegram: https://t.me/c/2225351477/29
 */
class Solution {
    fun minDepth(root: TreeNode?): Int {
        if(root == null) return 0

        val left = minDepth(root.left)
        var right = minDepth(root.right)

        if(root.left != null && root.right != null) {
            return min(left+1,right+1)
        }

        return max(left + 1, right + 1)
    }
}