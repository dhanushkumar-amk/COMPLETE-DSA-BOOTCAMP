package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String text1 =  
    }

   public static int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m + 1];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return function(n - 1, m -1, text1, text2, dp);
    }

    private static int function(int i, int j, String text1, String text2, int[][] dp) {

        // base case
        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (text1.charAt(i) == text2.charAt(j))
            return dp[i][j] =  1 + function(i -1, j - 1, text1, text2, dp);


        return dp[i][j] =  Math.max(function(i - 1, j, text1, text2, dp), function(i, j - 1, text1, text2, dp));

    }
}
