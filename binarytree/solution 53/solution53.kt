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
 * Issue/Проблема: https://leetcode.com/problems/binary-tree-paths/
 * 
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 * 
 * A leaf is a node with no children.
 * 
 * Дан корень root бинарного дерева, верните все пути от корня к листьям. Лист это узел без детей.
 * 
 * Constraints/Ограничения:
 * 
 * - The number of nodes in the tree is in the range [1, 100].
 * - -100 <= Node.val <= 100
 * 
 * Score solution/Оценка решения:
 * Runtime beats 26,97%
 * Memory beats 20,22%
 * 
 * https://t.me/c/2225351477/80
 */
class Solution {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        if(root == null) return emptyList()
        if (root?.left == null && root?.right == null) 
            return listOf(root?.`val`.toString())

        val resultList = mutableListOf<String>()
        binaryTreePaths(root?.left).forEach {
            resultList.add("${root?.`val`.toString()}->$it")
        }
        binaryTreePaths(root?.right).forEach {
            resultList.add("${root?.`val`.toString()}->$it")
        }

        return resultList.toList()
    }
}