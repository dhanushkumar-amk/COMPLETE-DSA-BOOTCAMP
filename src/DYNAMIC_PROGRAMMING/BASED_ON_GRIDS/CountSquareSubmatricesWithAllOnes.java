package DYNAMIC_PROGRAMMING.BASED_ON_GRIDS;

public class CountSquareSubmatricesWithAllOnes {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
        };

        System.out.println(countSquares(matrix));
    }

    public static int countSquares(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] dp = new int[n][m];
        int sum = 0;

        // Initialize dp array and calculate sum
        for (int i = 0; i < n; i++) {
            dp[i][0] = matrix[i][0];
            sum += dp[i][0];
        }
        for (int j = 1; j < m; j++) {
            dp[0][j] = matrix[0][j];
            sum += dp[0][j];
        }

        // Build the dp array
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    sum += dp[i][j];
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return sum;
    }
}
