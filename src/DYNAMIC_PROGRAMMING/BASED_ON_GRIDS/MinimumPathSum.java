package DYNAMIC_PROGRAMMING.BASED_ON_GRIDS;


//leetcode 64
// https://leetcode.com/problems/minimum-path-sum/description/

import java.util.Arrays;

public class MinimumPathSum {

    public static void main(String[] args) {
        int matrix[][] = {
                {5, 9, 6},
                {11, 5, 2}
        };

        MinimumPathSum ans = new MinimumPathSum();
        System.out.println(ans.minPathSum( matrix));
    }


    // tabulation method
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return minPath( grid, dp);

    }

    private int minPath( int[][] grid, int[][] dp) {

        int m = grid.length;
        int n = grid[0].length;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 && col == 0)
                    dp[row][col] = grid[row][col];
                else{

                    int upDirection = grid[row][col];

                    if (row > 0)
                        upDirection += dp[row - 1][col];
                    else
                        upDirection += (int) Math.pow(10, 9);


                    // left direction
                    int leftDirection = grid[row][col];

                    if (col > 0)
                        leftDirection += dp[row][col - 1];
                    else
                        leftDirection += (int) Math.pow(10, 9);

                    dp[row][col] = Math.min(leftDirection, upDirection);
                }
            }
        }
    return dp[m - 1][n - 1];
    }


    // memoization method
    static int minSumPathUtil(int i, int j, int[][] matrix, int[][] dp) {
        // Base cases
        if (i == 0 && j == 0)
            return matrix[0][0]; // If we're at the top-left cell, return its value
        if (i < 0 || j < 0)
            return (int) Math.pow(10, 9); // If we're out of bounds, return a large value
        if (dp[i][j] != -1)
            return dp[i][j]; // If we've already calculated this cell, return the stored result

        // Calculate the sum of the current cell plus the minimum sum path from above and from the left
        int up = matrix[i][j] + minSumPathUtil(i - 1, j, matrix, dp);
        int left = matrix[i][j] + minSumPathUtil(i, j - 1, matrix, dp);

        // Store the minimum of the two possible paths
        return dp[i][j] = Math.min(up, left);
    }

    // Main function to calculate the minimum sum path in the matrix
    static int minSumPath(int n, int m, int[][] matrix) {
        int dp[][] = new int[n][m];

        // Initialize the DP matrix with -1
        for (int row[] : dp)
            Arrays.fill(row, -1);

        // Call the helper function starting from the bottom-right cell
        return minSumPathUtil(n - 1, m - 1, matrix, dp);
    }

}
