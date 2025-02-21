package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;


// leetcode 322
// https://leetcode.com/problems/coin-change/description/


import java.util.Arrays;

public class CoinChange {


    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        int T = 7;

        // Call the minimumElements function and print the result
        System.out.println("The minimum number of coins required to form the target sum is " + coinChange(arr, T));
    }

    public static int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[][] dp = new int[n][amount + 1];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return function( n-1, coins, amount, dp);
    }

    static int function(int index, int[] coins, int target, int[][] dp){

        if (index == 0){
            if (target % coins[0] == 0)
                return target / coins[0];
            else
                return (int) 1e9;
        }

        if (dp[index][target] != -1)
            return dp[index][target];

        int notPick = 0 + function(index -1, coins, target, dp);

        int pick = Integer.MAX_VALUE;
        if (coins[index] <= target)
            pick = 1 + function(index, coins, target - coins[index], dp);

        return dp[index][target] =  Math.min(pick, notPick);
    }
}
