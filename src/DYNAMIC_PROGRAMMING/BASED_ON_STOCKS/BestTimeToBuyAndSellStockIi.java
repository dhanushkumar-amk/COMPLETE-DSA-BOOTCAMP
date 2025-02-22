package DYNAMIC_PROGRAMMING.BASED_ON_STOCKS;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
// leetcode 122

import OOPS.INTERFACES.EXTENDSDEMO.B;

public class BestTimeToBuyAndSellStockIi {


    public static void main(String[] args) {

        BestTimeToBuyAndSellStockIi answer = new BestTimeToBuyAndSellStockIi();

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(answer.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {

        return function(0, 1, prices);
    }

    int function(int index, int buy, int[] prices){

        int n = prices.length;

        // base case
        if (index == n)
            return 0;

        int profit = 0;
        if (buy == 0)
            profit = Math.max(-prices[index] + function(index + 1, 1, prices),
                   0 +  function(index + 1, 0, prices));
        else
            profit = Math.max(prices[index] + function(index + 1, 1, prices),
                    0 + function(index + 1, 0, prices));

        return profit;
    }
}
