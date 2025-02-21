package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;


// leetcode 518
// https://leetcode.com/problems/coin-change-ii/

import java.util.Arrays;

public class CoinChange2 {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        int target = 4;


        // Call the countWaysToMakeChange function and print the result
        System.out.println("The total number of ways is " + change(target, arr));
    }

    public static int change(int amount, int[] coins) {

        int n = coins.length;

        int[][] dp = new int[n][amount + 1];

        for(long[] row : dp)
            Arrays.fill(row, -1);

        return function(n -1, amount, coins);
    }

    static int function(int index, int target, int[] coins){

        // base case
        if (index == 0){
            if (target % coins[0] == 0)
                return 1;
            else
                return 0;
        }

        int notPick = function(index -1, target, coins);

        int pick = 0;
        if (coins[index] <= target)
            pick = function(index , target - coins[index], coins);

        return pick + notPick;
    }

}
