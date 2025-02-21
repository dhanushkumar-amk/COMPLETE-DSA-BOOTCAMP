package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

import java.util.Arrays;

public class RodCuttingProblem {


    public static void main(String[] args) {
        int[] price = {2,5,7,8,10};
        int totalRodLength = 5;

        System.out.println(cutRod(price, totalRodLength));

    }

    static int  cutRod(int[] price, int totalRodLength){

        int n = price.length;
        int[][] dp = new int[n][totalRodLength + 1];

        for(int[] row : dp)
            Arrays.fill(dp, -1);

        return function(n - 1, totalRodLength, price, dp);
    }


    static int function(int index, int remainingRod, int[] price, int[][] dp){

        if (index == 0)
            return remainingRod * price[0];

        if (dp[index][remainingRod] != -1)
            return dp[index][remainingRod];

        int notPick = 0 + function(index - 1, remainingRod, price, dp);

        int pick = Integer.MIN_VALUE;
        int rodLength = index + 1;

        if (rodLength <= remainingRod)
            pick = price[index] + function(index, remainingRod - rodLength,  price, dp);

        return dp[index][remainingRod] = Math.max(pick, notPick);
    }
}
