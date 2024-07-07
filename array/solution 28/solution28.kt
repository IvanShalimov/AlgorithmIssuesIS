/**
 * Source/Исчтоник: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Issue/Проблема:
 * 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * 
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * 
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * 
 * Дан массив цен prices, где каждый элемент это цена на n-й день. 
 * Необходимо максимизировать прибыль, купив в один день(по самой выгодной цене) и продав в будущем(то есть после дня покупки) 
 * по самой высокой цене. Необходимо вернуть максимальную прибыль, которую ты сможешь получить от этой транзакции. Если это невозможно, то вернуть 0.
 * 
 * Constraints/Ограничения:
 * 
 * - 1 <= prices.length <= 10^5
 * - 0 <= prices[i] <= 10^4
 * 
 * Score solution/Оценка решения:
 * Runtime beats 27,67%
 * Memory beats 94,04%
 * 
 * Telegram: https://t.me/c/2225351477/33
 */
class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        var buy = prices[0]

        prices.indices.forEach { index -> 
            if(buy > prices[index]) {
                buy = prices[index]
            } else {
                val temp = prices[index] - buy 
                if(max < temp) {
                    max = temp
                }
            }
        }

        return max
    }
}