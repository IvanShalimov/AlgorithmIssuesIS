/**
 *
 * Issue/Проблема: https://leetcode.com/problems/first-bad-version/
 * 
 * You are a product manager and currently leading a team to develop a new product. 
 * Unfortunately, the latest version of your product fails the quality check. 
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * 
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * 
 * You are given an API bool isBadVersion(version) which returns whether version is bad. 
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= bad <= n <= 2^31 - 1
 * 
 * Score solution/Оценка решения:
 * Runtime beats 52,78% (O(logN))
 * Memory beats 59,03% (O(N))
 * 
 * https://t.me/c/2225351477/84
 */
class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var left = 1
        var right = n
        while (left <= right) {
            val mid = left+ (right - left) / 2
            if (isBadVersion(mid)) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return left
	}
}