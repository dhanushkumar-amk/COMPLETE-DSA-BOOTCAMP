package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

import java.util.Arrays;

public class LongestPalindromicSubsequence {


    public static void main(String[] args) {
        LongestPalindromicSubsequence answer = new LongestPalindromicSubsequence();
        
    }

    public int longestPalindromeSubseq(String s) {

        String reversed = new StringBuilder(s).reverse().toString();
        int n = s.length();

        int[][] dp = new int[n][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return function(s, reversed, n - 1, n - 1, dp);
    }

    int function(String  orginalString, String reverseString, int i, int j, int[][] dp){

        if (i == 0 || j == 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (orginalString.charAt(i) == reverseString.charAt(j))
            return dp[i][j] = 1 + function(orginalString, reverseString,i -1,j - 1, dp);
        else
            return dp[i][j] = Math.max(function(orginalString, reverseString, i - 1, j, dp), function(orginalString, reverseString, i, j - 1, dp));
    }
}
