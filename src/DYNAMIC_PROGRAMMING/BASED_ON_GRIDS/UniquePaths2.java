package DYNAMIC_PROGRAMMING.BASED_ON_GRIDS;

//leetcode 63
// https://leetcode.com/problems/unique-paths-ii/description/

public class UniquePaths2 {


    public static void main(String[] args) {
        UniquePaths2 ans = new UniquePaths2();

        int[][] maze = {
                {0, 0, 0},
                {0, -1, 0},
                {0, 0, 0}
        };

        System.out.println(ans.uniquePathsWithObstacles(maze));

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

        if (row == 0 || col == 0)
            return 1;

        if(dp[row][col] != -1)
            return dp[row][col];

        int upDirection = mazeObstaclesUtil(row - 1, col, obstacleGrid, dp);
        int leftDirection = mazeObstaclesUtil(row, col - 1, obstacleGrid, dp);

        dp[row][col] = upDirection + leftDirection;

        return dp[row][col];

    }

}
