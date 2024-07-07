/**
 * Source/Исчтоник: https://leetcode.com/problems/path-sum/
 * Issue/Проблема:
 * 
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such 
 * that adding up all the values along the path equals targetSum.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Дан корень бинарного дерева root и целое число targetSum. 
 * Верните true если в дереве есть такой путь от корня до листа, чтобы сумма ключей давала targetSum.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [0, 5000].
 * - -1000 <= Node.val <= 1000
 * - -1000 <= targetSum <= 1000
 * 
 * Score solution/Оценка решения:
 * Runtime beats 46,48%
 * Memory beats 61,41%
 * 
 * Telegram: https://t.me/c/2225351477/30
 */
class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false

        val newSum =  targetSum - root.`val`
        
        return (newSum == 0 && (root.left == null && root.right == null)) ||
            hasPathSum(root.left, newSum) ||  hasPathSum(root.right, newSum)
    }
}