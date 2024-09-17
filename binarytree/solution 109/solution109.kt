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
 * Issue/Проблема: https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 * 
 * Given a n-ary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * 
 * Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
 * 
 * Constraints/Ограничения:
 * 
 * - The total number of nodes is in the range [0, 10^4].
 * - The depth of the n-ary tree is less than or equal to 1000.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 74,00% O(N) 
 * Memory beats 84,00% O(N)
 * 
 * TG: https://t.me/c/2225351477/122
 */
class Solution {
    fun maxDepth(root: Node?): Int {
        if(root == null) return 0
        
        val bfsQueue: Queue<Node> = LinkedList()
        bfsQueue.offer(root)
        var depth = 0
        
        while(!bfsQueue.isEmpty()){                    
            var size = bfsQueue.size
            for(i in 0 until size){
                var current = bfsQueue.poll()
                for(child in current!!.children){
                    bfsQueue.offer(child)
                }
            }
            depth++
        }

        return depth
    }
}