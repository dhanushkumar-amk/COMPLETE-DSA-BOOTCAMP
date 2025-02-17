package DYNAMIC_PROGRAMMING.BASED_ON_GRIDS;

import java.util.Arrays;

public class CheeryPickup {
    public static void main(String[] args) {

    }

    static int maximumChocolates(int n, int m, int[][] grid) {
        // Create a 3D array to store computed results
        int[][][] dp = new int[n][m][m];

        // Initialize the dp array with -1
        for (int[][] row1 : dp) {
            for (int[] row2 : row1) {
                Arrays.fill(row2, -1);
            }
        }

        // Call the utility function to find the maximum number of chocolates

        return maxChocoUtil(0, 0, m - 1, n, m, grid, dp);
    }

    private static int maxChocoUtil(int i, int j1, int j2, int n, int m, int[][] grid, int[][][] dp) {

        // bounty case
        if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m)
            return (int) (Math.pow(-10, 9));


        // base case => destination
        if (i == n - 1) {
            // both go on same destination
            if (j1 == j2)
                return grid[i][j1];
            else
                return grid[i][j1] + grid[i][j2];
        }

        int maxi = (int) (-1e9);

        // explore all paths on bob and alice in simultaneously
        for (int dj1 = -1; dj1 <= 1; dj1++) { // for alice
            for (int dj2 = -1; dj2 <= 1; dj2++) { // for bob
                int answer = 0;

                // if both in same cell then take the consideration of one and move
                if (j1 == j2)
                    answer = grid[i][j1];

                else
                    answer = grid[i][j1] + grid[i][j2] + maxChocoUtil(i + 1, j1 +dj1, j2 + dj2, n, m , grid,dp);

                maxi = Math.max(maxi, answer);
            }
        }
    return dp[i][j1][j2] = maxi;
    }
}
