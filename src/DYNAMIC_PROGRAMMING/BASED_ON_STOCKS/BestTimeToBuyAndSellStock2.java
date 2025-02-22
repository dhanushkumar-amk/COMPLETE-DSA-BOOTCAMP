package DYNAMIC_PROGRAMMING.BASED_ON_STOCKS;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock2 {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock2 answer = new BestTimeToBuyAndSellStock2();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(answer.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {

        int n = prices.length;

        int[][] dp = new int[n][2];

        for(int[] row : dp)
            Arrays.fill(row, -1);


        return function(0, 1, prices, dp);
    }

    int function(int index, int buy, int[] prices, int[][] dp) {
        int n = prices.length;

        // Base case: if index reaches end of prices array, return 0 profit
        if (index >= n)  // changes 1
            return 0;

        if (dp[index][buy] != -1)
            return dp[index][buy];

        int profit = 0;
        if (buy == 1) { // If we can buy
            profit = Math.max(
                    -prices[index] + function(index + 1, 0, prices, dp),  // Buy stock
                    function(index + 1, 1, prices, dp)  // Skip this day
            );
        } else { // If we can sell
            profit = Math.max(
                    prices[index] + function(index + 2, 1, prices, dp),  // Sell stock // changes 2
                    function(index + 1, 0, prices, dp)  // Skip this day
            );
        }

        return dp[index][buy] =  profit;
    }
}
