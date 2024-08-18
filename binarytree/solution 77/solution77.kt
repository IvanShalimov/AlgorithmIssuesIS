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
 * Issue/Проблема: https://leetcode.com/problems/sum-of-left-leaves/
 * 
 * Given the root of a binary tree, return the sum of all left leaves.
 * 
 * A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
 * 
 * Дан корень root бинарного дерева , верните сумму всех левых листьев дерева. 
 * Лист это узел в дереве у которого нет потомков. Левый лист это такой лист, который является левым потомком. 
 * То есть корень дерева не может быть листом ни при каком условии.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [1, 1000].
 * - -1000 <= Node.val <= 1000
 * 
 * Score solution/Оценка решения:
 * Runtime beats 84,95% O(N) 
 * Memory beats 41,94% O(N)
 * 
 * Telegram: https://t.me/c/2225351477/109
 */
class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var curIndex = 0
        t.forEachIndexed { index, char ->
            if (curIndex >= s.length) return true
            if(char == s[curIndex]) curIndex++    
        }

        if (curIndex >= s.length) return true
        
        return false
    }
}