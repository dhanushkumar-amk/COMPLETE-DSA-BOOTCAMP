package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;


//leetcode 1312
// https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/description/

import java.util.Arrays;

public class MinimumInsertionStepsToMakeAStringPalindrome {

    public static void main(String args[]) {
        String s = "abcaa";


        MinimumInsertionStepsToMakeAStringPalindrome answer = new MinimumInsertionStepsToMakeAStringPalindrome();

        System.out.println("The Minimum insertions required to make the string palindrome: " + answer.minInsertions(s));
    }

    public int minInsertions(String s) {

        int size = s.length();
        return size - longestPalindromeSubseq(s);
    }

// longest subsequenc eanswer just copy
    public int longestPalindromeSubseq(String s) {

        String reversed = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int m = reversed.length();

        int[][] dp = new int[n][m + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return function(s, reversed, n - 1, m - 1, dp);
    }

    int function(String  orginalString, String reverseString, int i, int j, int[][] dp){

        if (i < 0 || j < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (orginalString.charAt(i) == reverseString.charAt(j))
            return dp[i][j] = 1 + function(orginalString, reverseString,i - 1,j - 1, dp);
        else
            return dp[i][j] = Math.max(function(orginalString, reverseString, i - 1, j, dp), function(orginalString, reverseString, i, j - 1, dp));
    }

}
