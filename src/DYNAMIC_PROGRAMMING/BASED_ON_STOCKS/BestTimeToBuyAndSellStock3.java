package DYNAMIC_PROGRAMMING.BASED_ON_STOCKS;


// leetcode 123
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/

import java.util.Arrays;

public class BestTimeToBuyAndSellStock3 {


    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        int n = prices.length;

        // Calculate and print the maximum profit
        System.out.println("The maximum profit that can be generated is " + maxProfit(prices));
    }

    public static int maxProfit1(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][3];

        // Initialize dp array with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return function(0, 1, 2, prices, dp); // Changed buy from 0 → 1
    }

    private static int function(int index, int buy, int transaction, int[] price, int[][][] dp) {
        int n = price.length;

        // Base case
        if (index == n || transaction == 0)
            return 0;

        if (dp[index][buy][transaction] != -1)
            return dp[index][buy][transaction];

        if (buy == 1) {
            // Buy or Skip
            dp[index][buy][transaction] = Math.max(
                    -price[index] + function(index + 1, 0, transaction, price, dp), // Buy
                    function(index + 1, 1, transaction, price, dp) // Skip
            );
        } else {
            // Sell or Skip
            dp[index][buy][transaction] = Math.max(
                    price[index] + function(index + 1, 1, transaction - 1, price, dp), // Sell
                    function(index + 1, 0, transaction, price, dp) // Skip
            );
        }

        return dp[index][buy][transaction];
    }


    // tabulation method
    public  static int maxProfit(int[] prices){
        int n = prices.length;

        int[][][] dp = new int[n + 1][2][3];

        // base case 1 if transaction == 0 return 0
//        for (int index = n - 1; index >= 0 ; index--) {
//            for (int buy = 0; buy <= 1 ; buy++) {
//                dp[index][buy][0] = 0;
//            }
//        }
//
//        // base case  if index == n return 0
//        for (int buy = 0; buy <= 1 ; buy++) {
//            for (int transaction = 0; transaction <= 2 ; transaction++) {
//                dp[n][buy][transaction] = 0;
//            }
//        }


        // Loop through the dp array, starting from the second last stock (ind=n-1)
        for (int ind = n - 1; ind >= 0; ind--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int cap = 1; cap <= 2; cap++) {

                    if (buy == 0) { // We can buy the stock
                        dp[ind][buy][cap] = Math.max(0 + dp[ind + 1][0][cap],
                                -prices[ind] + dp[ind + 1][1][cap]);
                    }

                    if (buy == 1) { // We can sell the stock
                        dp[ind][buy][cap] = Math.max(0 + dp[ind + 1][1][cap],
                                prices[ind] + dp[ind + 1][0][cap - 1]);
                    }
                }
            }
        }

        // The maximum profit with 2 transactions is stored in dp[0][0][2]
        return dp[0][0][2];


        
        
    }
}
