package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

import java.util.Arrays;

// https://leetcode.com/problems/longest-common-subsequence/description/
// leetcode 1143

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String s1 = "acd";
        String s2 = "ced";

        System.out.println("The Length of Longest Common Subsequence is " + longestCommonSubsequence(s1, s2));

    }

   public static int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m + 1];

        for(int[] row : dp)
            Arrays.fill(row, -1);

       for (int j = 0; j <= m; j++)
           dp[0][j] = 0;

       for (int i = 0; i <= n; i++)
           dp[i][0] = 0;

       for (int i = 1; i <= n ; i++) {
           for (int j = 1; j <= m ; j++) {
               if (text1.charAt(i) == text2.charAt(j))
                    dp[i][j] = 1 + dp[i - 1][j - 1];


                dp[i][j] =  Math.max(dp[i - 1][j], dp[i][j - 1]);

           }
       }

        return dp[n][m];
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
