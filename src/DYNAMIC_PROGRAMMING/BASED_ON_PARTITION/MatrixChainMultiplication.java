package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;

import java.util.Arrays;

public class MatrixChainMultiplication {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("The minimum number of operations are "+
                tabulations(arr));
    }

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
        for (int k = i; k <= j - 1; k++) {
            int steps = arr[i -1] * arr[k] * arr[j] + function(i, k, arr, dp) + function(k + 1 , j, arr,dp );

            minimumSteps = Math.min(minimumSteps,steps);
        }
        return dp[i][j] =  minimumSteps;
    }


    // tabulation method
    static int tabulations(int[] arr){

        int n = arr.length;
        int[][] dp = new int[n][n];

        // base case
        for (int i = 1; i < n; i++)
            dp[i][i] = 0;

        for (int i = n - 1; i >= 1; i--) {
            for (int j = i + 1; j < n ; j++) {
                int minimumSteps = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int steps = arr[i -1] * arr[k] * arr[j] + dp[i][k] + dp[k + 1][j];

                    minimumSteps = Math.min(minimumSteps,steps);
                }
                dp[i][j] =  minimumSteps;
            }
        }
       return dp[1][n - 1];
    }
}
