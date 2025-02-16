package DYNAMIC_PROGRAMMING.BASED_ON_GRIDS;


//leetcode 64
// https://leetcode.com/problems/minimum-path-sum/description/

public class MinimumPathSum {

    public static void main(String[] args) {

    }

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
                }
            }
        }

    }
}
