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
 * Source/Исчтоник: https://leetcode.com/problems/same-tree/
 * Issue/Проблема:
 * 
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * Даны два бинарных дерева p и q. Напишите функцию которая проверяет их идентичность. 
 * Два бинарных дерева равны в том случае, если их структура совпадает, а узлы имеет соответственно равные значения.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in both trees is in the range [0, 100].
 * - -104 <= Node.val <= 104
 * 
 * Score solution/Оценка решения:
 * Runtime beats 24,42%
 * Memory beats 70,97%
 * 
 * Telegram: https://t.me/c/2225351477/24
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