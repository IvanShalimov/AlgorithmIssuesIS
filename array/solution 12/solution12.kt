/**
 * Source/Исчтоник: https://leetcode.com/problems/plus-one/
 * Issue/Проблема:
 * 
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
 * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * На вход дан массив целых чисел, которые в совокупности представляют большое число (другими словами, каждый элемент в массиве это разряд числа). 
 * Необходимо инкрементировать представленное число на единицу и вернуть результат.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= digits.length <= 100
 * - 0 <= digits[i] <= 9
 * - digits does not contain any leading 0's.
 * 
 * Score solution/Оценка решения:
 * Runtime beats 51,41%
 * Memory beats 85,95%
 * 
 * Telegram: https://t.me/c/2225351477/15
 */
class Solution {

    fun plusOne(digits: IntArray): IntArray {
        if(digits.size == 0) return intArrayOf(1)
        var index = digits.size-1
        var transfer = 0
        digits[index] = digits[index] + INCREMENT + transfer
        while(index >= 0) {
            
            if(transfer > 0) {
                digits[index] = digits[index] + transfer
                transfer = 0
            }
            
            if(digits[index] >= 10) {
                digits[index] = 0
                transfer = 1
            } else {
                break;
            }
            index--
        }

        if(transfer > 0) {
            val resultArray = IntArray(digits.size+1)
            resultArray[0] = transfer
            transfer = 0
            for(index in 0..digits.size-1) {
                resultArray[index+OFFSET] = digits[index]
            }
            return resultArray
        }

        return digits
    }
}