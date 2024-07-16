/**
 * 
 * Issue/Проблема: https://leetcode.com/problems/implement-stack-using-queues/
 * 
 * Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 * 
 * Implement the MyStack class:
 * 
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 * 
 * Notes:
 * 
 * You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
 * Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= x <= 9
 * - At most 100 calls will be made to push, pop, top, and empty.
 * - All the calls to pop and top are valid.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 39,67%
 * Memory beats 32,23%
 * 
 * https://t.me/c/2225351477/69
 */
class MyStack() {
    val first: Queue<Int>
    val second: Queue<Int>

    init {
        first = ArrayDeque<Int>()
        second = ArrayDeque<Int>()
    }

    fun push(x: Int) {
        while (first.isNotEmpty()) second.add(first.poll())
        first.add(x)
        while (second.isNotEmpty()) first.add(second.poll())
    }

    fun pop(): Int {
        return first.poll()
    }

    fun top(): Int {
        return first.peek()
    }

    fun empty(): Boolean {
        return first.isEmpty()
    }
}