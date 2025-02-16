package DYNAMIC_PROGRAMMING.BASED_ON_GRIDS;

import java.util.Arrays;

public class CountUniquePaths {
    public static void main(String args[]) {
        int m = 3;
        int n = 2;

        System.out.println(countWays(m, n));
    }

    static int countWays(int m, int n) {

        int[][] dp = new int[m][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        // Start the recursive calculation from the bottom-right cell (m-1, n-1)
        return countWaysUtil(m - 1, n - 1, dp);
    }

    private static int countWaysUtil(int row, int col, int[][] dp) {

        // reach the destination
        if (row == 0  || col == 0)
            return 1;

        // validation
        if (row < 0 ||col < 1)
            return 0;

        if (dp[row][col] != -1)
            return dp[row][col];

        int upDirection = countWaysUtil(row - 1, col, dp);
        int leftDirection = countWaysUtil(row, col - 1, dp);

        return dp[row][col] = upDirection + leftDirection;
    }
}
