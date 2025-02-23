package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;

import java.util.Arrays;

public class MatrixChainMultiplication {

    static int matrixMultiplication(int[] arr){

        int n = arr.length;

        int[][] dp = new int[n][n];

        for(int[] row:dp)
            Arrays.fill(row,-1);

        return function(1, n - 1, arr, dp);
    }

    static int function(int i, int j, int[] arr, int[][] dp){

        // base case
        if (i == j)
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];

        int minimumSteps = Integer.MAX_VALUE;
        for (int k = i; k < j - 1; k++) {
            int steps = arr[i -1] * arr[k] * arr[j] + function(i, k-1, arr, dp) + function(k , j, arr,dp );

            if (steps < minimumSteps)
                minimumSteps = steps;
        }
        return minimumSteps;
    }
}
