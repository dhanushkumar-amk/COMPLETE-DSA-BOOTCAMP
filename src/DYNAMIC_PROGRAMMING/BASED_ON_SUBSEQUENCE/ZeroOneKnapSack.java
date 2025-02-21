package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

import java.util.Arrays;

public class ZeroOneKnapSack {

    public static void main(String[] args) {
        int[] weight = {3,2,5};
        int[] value = {30, 40, 50};
        int maxWeight = 8;
        int n = value.length;

        System.out.println(knapSack(weight, value, n, maxWeight ));
    }

    // memorization
    static  int knapSack(int[] weight, int[] value, int n, int maxWeight){

        int[][] dp = new int[n][maxWeight + 1];

        for(int[] row: dp)
            Arrays.fill(row,-1);

        return function(n -1 , maxWeight, weight, value, dp);
    }

    static int function(int index, int bagWeight, int[] weight, int[] value, int[][] dp){

        if (index == 0){
            if (weight[0] <= bagWeight)
                return value[0];
            else
                return 0;
        }

        if (dp[index][bagWeight] != -1)
            return dp[index][bagWeight];

        int notSteal = 0 + function(index -1, bagWeight, weight, value, dp);

        int steal = Integer.MIN_VALUE;
        if (weight[index] <= bagWeight)
            steal = value[index] + function(index - 1, bagWeight - weight[index], weight, value, dp);

        return dp[index][bagWeight] =  Math.max(steal, notSteal);
    }

}
