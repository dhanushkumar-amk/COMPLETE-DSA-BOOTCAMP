package DYNAMIC_PROGRAMMING.BASED_ON_GRIDS;

import java.util.List;

public class MinimumPathSumInTriangle {

    public static void main(String[] args) {
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );

        int result = minimumTotal(triangle);
        System.out.println(result); // Output: 11
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }

        return minimumPath(0, 0, triangle, dp);
    }

    private static int minimumPath(int row, int col, List<List<Integer>> triangle, int[][] dp) {
        int m = triangle.size();

        if (row == m - 1) {
            return triangle.get(row).get(col);
        }

        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        int downDirection = triangle.get(row).get(col) + minimumPath(row + 1, col, triangle, dp);
        int downDiagonalDirection = triangle.get(row).get(col) + minimumPath(row + 1, col + 1, triangle, dp);

        dp[row][col] = Math.min(downDirection, downDiagonalDirection);

        return dp[row][col];
    }
}