package DYNAMIC_PROGRAMMING.BASED_ON_GRIDS;

import java.util.List;

public class MinimumPathSumInTriangle {

    public static void main(String[] args) {

    }

    public int minimumTotal(List<List<Integer>> triangle) {

        int m = triangle.size();
        int n = triangle.get(0).size();

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return minimumPath(0,0, triangle, dp);

    }

    private int minimumPath( int row, int col, List<List<Integer>> triangle, int[][] dp){
        int m = triangle.size();
        int n = triangle.get(0).size();

        // base case
        if (row == m - 1)
            return triangle.get(m - 1).get(col);


        if (dp[row][col] != -1)
            

    }

}
