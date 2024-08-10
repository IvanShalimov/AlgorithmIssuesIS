/**
 *
 * Issue/Проблема: https://leetcode.com/problems/guess-number-higher-or-lower/
 * 
 * We are playing the Guess Game. The game is as follows:
 * 
 * I pick a number from 1 to n. You have to guess which number I picked.
 * 
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * 
 * You call a pre-defined API int guess(int num), which returns three possible results:
 * 
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= n <= 2^31 - 1
 * - 1 <= pick <= n
 * 
 * Score solution/Оценка решения:
 * Runtime beats - O(logN) 
 * Memory beats - O(1)
 * 
 * Telegram: https://t.me/c/2225351477/105
 */
class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        if(n == 1) return 1
        var start = 0
        var end = n
        while (end >= start) {
            val middle: Int = (start+end)/2
            when (guess(middle)) {
                0 -> return middle
                -1 -> end = end-1
                1 -> start = middle+1
            }
        }
        return -1
    }
}