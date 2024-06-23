/**
 * Source/Исчтоник: https://leetcode.com/problems/balanced-binary-tree/
 * Issue/Проблема:
 * 
 * Given a binary tree, determine if it is height-balanced.
 * 
 * Дано бинарное дерево, определите если оно сбалансированное. Сбалансированное бинарное дерево это такое дерево, 
 * в котором глубина каждого из поддеревьев отличается не более чем на единицу.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [0, 5000].
 * - -10^4 <= Node.val <= 10^4
 * 
 * Score solution/Оценка решения:
 * Runtime beats 91,10%
 * Memory beats 98,47%
 * 
 * Telegram: https://t.me/c/2225351477/28
 */
class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        return traversal(root) != -1
    }

    fun traversal(root: TreeNode?): Int {
        if(root == null) return 0
        
        val left = traversal(root.left)
        val right = traversal(root.right)

        if(left == -1 || right == -1) return -1
        if(abs(left-right) > 1 ) return -1
        
        return max(left , right)+1
    }
}