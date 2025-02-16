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

    private int minimumPath( List<List<Integer>> triangle, int[][] dp){
        int m = triangle.size();
        int n = triangle.get(0).size();


    }

}
