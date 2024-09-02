/**
 *
 * Issue/Проблема: https://leetcode.com/problems/teemo-attacking/
 * 
 * Our hero Teemo is attacking an enemy Ashe with poison attacks! When Teemo attacks Ashe, Ashe gets poisoned for a exactly duration seconds.
 *  More formally, an attack at second t will mean Ashe is poisoned during the inclusive time interval [t, t + duration - 1]. 
 * If Teemo attacks again before the poison effect ends, the timer for it is reset, and the poison effect will end duration seconds after the new attack.
 * 
 * You are given a non-decreasing integer array timeSeries, where timeSeries[i] denotes that Teemo attacks Ashe at second timeSeries[i],
 * and an integer duration.
 * 
 * Return the total number of seconds that Ashe is poisoned.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= timeSeries.length <= 10^4
 * - 0 <= timeSeries[i], duration <= 10^7
 * - timeSeries is sorted in non-decreasing order.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 87,50% O(N) 
 * Memory beats 70,83% O(1)
 * 
 * https://t.me/c/2225351477/117
 */
class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        if(timeSeries.size == 1) return duration
        var sum = duration
        for(index in 1..timeSeries.size-1) {
            if(timeSeries[index] - timeSeries[index-1] >= duration) {
                sum +=duration
            } else {
                sum += (timeSeries[index] - timeSeries[index-1])
            }
        }
        return sum    
    }
}