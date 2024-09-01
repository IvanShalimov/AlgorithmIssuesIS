/**
 *
 * Issue/Проблема: https://leetcode.com/problems/construct-the-rectangle/
 * 
 * A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, 
 * your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:
 * 
 * The area of the rectangular web page you designed must equal to the given target area.
 * The width W should not be larger than the length L, which means L >= W.
 * The difference between length L and width W should be as small as possible.
 * Return an array [L, W] where L and W are the length and width of the web page you designed in sequence.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= area <= 10^7
 * 
 * Score solution/Оценка решения:
 * Runtime beats 14,81% O(1) 
 * Memory beats 96,30% O(1)
 * 
 * https://t.me/c/2225351477/116
 */
class Solution {
    fun constructRectangle(area: Int): IntArray {
        var width: Int = ceil(sqrt(area.toDouble())).toInt();
        while(area % width != 0){
            width++;
        }
        return intArrayOf(width, area / width);
    }
}