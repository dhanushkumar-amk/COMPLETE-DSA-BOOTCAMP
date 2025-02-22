package DYNAMIC_PROGRAMMING.BASED_ON_STOCKS;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockWithTransactionFee {

    public static void main(String[] args) {

        BestTimeToBuyAndSellStockWithTransactionFee answer = new BestTimeToBuyAndSellStockWithTransactionFee();

        int prices[] = {1, 3, 2, 8, 4, 9};
        int n = prices.length;
        int fee = 2;

        System.out.println("The maximum profit that can be generated is " + answer.maxProfit(prices, fee));
    }

    public int maxProfit(int[] prices, int fee) {

        int n = prices.length;

        int[][] dp = new int[n][2];

        for(int[] row : dp)
            Arrays.fill(row, -1);


        return function(0, 1, prices, dp, fee);
    }

    int function(int index, int buy, int[] prices, int[][] dp, int fee) {
        int n = prices.length;

        // Base case: if index reaches end of prices array, return 0 profit
        if (index == n)
            return 0;

        if (dp[index][buy] != -1)
            return dp[index][buy];

        int profit = 0;
        if (buy == 1) { // If we can buy
            profit = Math.max(
                    -prices[index] + function(index + 1, 0, prices, dp, fee),  // Buy stock
                    function(index + 1, 1, prices, dp, fee)  // Skip this day
            );
        } else { // If we can sell
            profit = Math.max(
                    prices[index]  - fee + function(index + 1, 1, prices, dp, fee),  // Sell stock
                    function(index + 1, 0, prices, dp, fee)  // Skip this day
            );
        }

        return dp[index][buy] =  profit;
    }

}
