package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;


import java.util.Arrays;

public class PrintAllLongestCommonSubSequence {

        public static void main(String[] args) {
            String s1 = "acd";
            String s2 = "ced";

            int[][] dp = new int[s1.length()][s2.length()];
            for (int[] row : dp)
                Arrays.fill(row, -1);

            int length = longestCommonSubsequence(s1, s2, dp);
            System.out.println("The Length of Longest Common Subsequence is " + length);

            String lcs = printLCS(s1, s2, dp);
            System.out.println("The Longest Common Subsequence is: " + lcs);
        }

        public static int longestCommonSubsequence(String text1, String text2, int[][] dp) {

            int n = text1.length();
            int m = text2.length();

            return function(n - 1, m -1, text1, text2, dp);
        }

        private static int function(int i, int j, String text1, String text2, int[][] dp) {
            // base case
            if (i < 0 || j < 0)
                return 0;

            if (dp[i][j] != -1)
                return dp[i][j];

            if (text1.charAt(i) == text2.charAt(j))
                return dp[i][j] = 1 + function(i - 1, j - 1, text1, text2, dp);

            return dp[i][j] = Math.max(function(i - 1, j, text1, text2, dp), function(i, j - 1, text1, text2, dp));
        }

        public static String printLCS(String text1, String text2, int[][] dp) {
            int i = text1.length() - 1;
            int j = text2.length() - 1;

            StringBuilder lcs = new StringBuilder();

            while (i >= 0 && j >= 0) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    lcs.append(text1.charAt(i));
                    i--;
                    j--;
                } else if (i > 0 && (j == 0 || dp[i - 1][j] > dp[i][j - 1])) {
                    i--;
                } else {
                    j--;
                }
            }
            return lcs.reverse().toString(); // Reverse to get the correct order
        }
    }
