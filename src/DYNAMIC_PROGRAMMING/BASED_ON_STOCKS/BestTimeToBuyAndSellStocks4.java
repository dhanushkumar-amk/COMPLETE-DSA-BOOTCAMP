package DYNAMIC_PROGRAMMING.BASED_ON_STOCKS;

import java.util.Arrays;

public class BestTimeToBuyAndSellStocks4 {

    public static void main(String[] args) {


        BestTimeToBuyAndSellStocks4  answer = new BestTimeToBuyAndSellStocks4();

        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        int n = prices.length;

        // Calculate and print the maximum profit
        System.out.println("The maximum profit that can be generated is " +answer.maxProfit(3, prices));
    }

    public int maxProfit(int k, int[] prices) {
        int n = prices.length;

     // base case check
        if (n == 0 || k == 0) {
            return 0;
        }

        // Initialize dp array with -1
        int[][][] dp = new int[n][2][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return function(0, 1, k, prices, dp);
    }

    private int function(int index, int buy, int transaction, int[] prices, int[][][] dp) {
        int n = prices.length;

        // Base case
        if (index >= n || transaction == 0) {
            return 0;
        }

        if (dp[index][buy][transaction] != -1) {
            return dp[index][buy][transaction];
        }

        if (buy == 1) {
            // Buy or Skip
            dp[index][buy][transaction] = Math.max(
                    -prices[index] + function(index + 1, 0, transaction, prices, dp), // Buy
                    function(index + 1, 1, transaction, prices, dp) // Skip
            );
        } else {
            // Sell or Skip
            dp[index][buy][transaction] = Math.max(
                    prices[index] + function(index + 1, 1, transaction - 1, prices, dp), // Sell
                    function(index + 1, 0, transaction, prices, dp) // Skip
            );
        }

        return dp[index][buy][transaction];
    }
}
