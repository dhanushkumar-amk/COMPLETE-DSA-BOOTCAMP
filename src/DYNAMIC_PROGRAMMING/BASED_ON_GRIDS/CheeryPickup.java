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

    private static int maxChocoUtil(int i, int i1, int i2, int n, int m, int[][] grid, int[][][] dp) {
   
    }
}
