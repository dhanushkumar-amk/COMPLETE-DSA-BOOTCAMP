package DYNAMIC_PROGRAMMING.BASED_ON_GRIDS;

public class CountSquareSubmatricesWithAllOnes {

    public static void main(String[] args) {

    }

    public int countSquares(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] dp = new int[n][m];

        for (int col = 0; col < n; col++)
            dp[0][col] = matrix[0][col];

        for (int row = 0; row < n; row++)
            dp[row][0] = matrix[row][0];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (matrix[i][j] == 0)
                    dp[i][j] = 0;
                else
                    dp[i][j] = Math.min(dp[i - 1][j],
                              Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;

            }
        }
        // sum all values to get answer
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += dp[i][j];
            }
        }
        return sum;
    }
}
