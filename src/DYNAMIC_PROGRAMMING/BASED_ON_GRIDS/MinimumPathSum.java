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

        return minPath(m, n, grid, dp);

    }

    private int minPath(int row, int col, int[][] grid, int[][] dp) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (row == 0 && col == 0)
                    
            }
        }

    }
}
