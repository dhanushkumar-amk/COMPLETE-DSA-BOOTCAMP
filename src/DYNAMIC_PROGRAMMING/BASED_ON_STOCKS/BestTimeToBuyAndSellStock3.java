package DYNAMIC_PROGRAMMING.BASED_ON_STOCKS;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock3 {


    public int maxProfit(int[] prices) {

        int n = prices.length;

        int[][][] dp = new int[n][2][3];

        // Initialize the dp array with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return function(0, )
    }

    int function(int index, int buy, int transaction, int[] price, int[][][] dp){

        int n = price.length;

        // base case
        if (index == n || transaction == 0)
            return 0;

        if (dp[index][buy][transaction] != -1)
            return dp[index][buy][transaction];

        if (buy == 1)
            // buy
            return dp[index][buy][transaction] =  Math.max(-price[index] + function(index -1, 0, transaction, price,dp),
                    0 + function(index - 1, 1, transaction, price, dp)
                    );
        else
            // sell
            return dp[index][buy][transaction] = Math.max(price[index] + function(index -1, 1, transaction -1, price,dp),
                    0 + function(index -1, 0, transaction, price, dp)
                    );
    }
}
