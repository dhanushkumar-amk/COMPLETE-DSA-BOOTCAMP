package DYNAMIC_PROGRAMMING.BASED_ON_GRIDS;

//leetcode 63
// https://leetcode.com/problems/unique-paths-ii/description/

public class UniquePaths2 {


    public static void main(String[] args) {

    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return mazeObstaclesUtil(n - 1, m - 1, obstacleGrid, dp);
    }

    private int mazeObstaclesUtil(int row, int col, int[][] obstacleGrid, int[][] dp) {

        if (row >= 0 && col >= 0 && obstacleGrid[row][col] == -1)
            return 0;

        
    }

}
