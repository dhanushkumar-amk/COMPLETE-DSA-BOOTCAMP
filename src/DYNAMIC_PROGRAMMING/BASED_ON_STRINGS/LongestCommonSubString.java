package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

import java.util.Arrays;

public class LongestCommonSubString {

    // tabulation
  /*  static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Create a 2D array to store LCS lengths
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    int val = 1 + dp[i - 1][j - 1];
                    dp[i][j] = val;
                    ans = Math.max(ans, val);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return ans; // Return the length of the Longest Common Substring (LCS)
    }
    */
      public static void main(String args[]) {
        String s1 = "abcjklp";
        String s2 = "acjkp";

        // Call the lcs function and print the result
        System.out.println("The Length of Longest Common Substring is " + lcs(s1, s2));
    }


    /* Memoization */


     static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Create a DP array initialized with -1
        int[][] dp = new int[n + 1][m + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Track the maximum length of common substring
        int maxLength = 0;

        // Compute LCS using memoization
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                maxLength = Math.max(maxLength, function(s1, s2, i, j, dp));
            }
        }

        return maxLength;
    }

    static int function(String text1, String text2, int i, int j, int[][] dp) {

        if (i == 0 || j == 0) {
            return 0;
        }


        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // If characters match
        if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
            dp[i][j] = 1 + function(text1, text2, i - 1, j - 1, dp);
        } else {
            dp[i][j] = 0; // not match just add 0
        }

        return dp[i][j];
    }

}
