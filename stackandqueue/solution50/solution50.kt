/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/implement-queue-using-stacks/
 * 
 * Implement a first in first out (FIFO) queue using only two stacks. 
 * The implemented queue should *support all the functions of a normal queue (push, peek, pop, and empty).
 * 
 * Implement the MyQueue class:
 * 
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * 
 * Notes:
 * 
 * You must use only standard operations of a stack, which means only push to top, peek/pop from top,
 *  size, and is empty operations are valid.
 * Depending on your language, the stack may not be supported natively. 
 * You may simulate a stack using a list or deque (double-ended queue) as long as you use only 
 * a stack's standard operations.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= x <= 9
 * - At most 100 calls will be made to push, pop, peek, and empty.
 * - All the calls to pop and peek are valid.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 43,24%
 * Memory beats 60,00%
 * 
 * Telegram: https://t.me/c/2225351477/75
 */
class MyQueue(): ArrayList<Int>() {

    val stack = ArrayList<Int>()

    fun push(x: Int) {
        stack.add(x)
    }

    fun pop(): Int {
        if (size == 0) {
            while (stack.size != 0) {
                add(stack.removeLast())
            }
        }
        return removeAt(size - 1)
    }

    fun peek(): Int {
        if (size == 0) {
            while (stack.size != 0) {
                add(stack.removeLast())
            }
        }
        return elementAt(size - 1)
    }

    fun empty(): Boolean {
        return stack.size == 0 && size == 0
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */