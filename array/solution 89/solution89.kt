/**
 *
 * Issue/Проблема: https://leetcode.com/problems/island-perimeter/
 * 
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
 * 
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, 
 * and there is exactly one island (i.e., one or more connected land cells).
 * 
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. 
 * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 * 
 * Constraints/Ограничения:
 * 
 * - row == grid.length
 * - col == grid[i].length
 * - 1 <= row, col <= 100
 * - grid[i][j] is 0 or 1.
 * - There is exactly one island in grid.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 42,23% O(N) 
 * Memory beats 35,63% O(1)
 * 
 * Telegram: https://t.me/c/2225351477/114
 */
class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var sum = 0
        for(i in 0..grid.size-1) {
            for(j in 0..grid.get(i).size-1) {
                val cell = grid.get(i)[j]
                if(cell == 0) continue

                if(j == 0) sum++ else if(grid.get(i)[j-1] == 0) sum++
                if(j == grid.get(i).size-1) sum++ else if (grid.get(i)[j+1] == 0) sum++
                if(i == 0) sum++ else if(grid.get(i-1)[j] == 0) sum++
                if(i == grid.size-1) sum++ else if(grid.get(i+1)[j] == 0) sum++
            }
        }
        return sum
    }
}