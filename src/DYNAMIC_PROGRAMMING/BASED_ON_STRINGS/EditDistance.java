package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

// leetcode 72
// https://leetcode.com/problems/edit-distance/

import java.util.Arrays;

public class EditDistance {

    public static void main(String[] args) {
        String s1 = "horse";
        String s2 = "ros";

        EditDistance answer = new EditDistance();


        System.out.println("The minimum number of operations required is: " +
               answer.minDistance(s1, s2));
    }

// memization
//    public int minDistance(String word1, String word2) {
//
//        int n = word1.length();
//        int m = word2.length();
//
//        int[][] dp = new int[n][m];
//
//        for(int[] row : dp)
//            Arrays.fill(row, -1);
//
//        return function(n -1, m - 1, word1, word2, dp);
//
//    }

    // tabulation
    public int minDistance(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n + 1][m + 1];

        for(int[] row : dp)
            Arrays.fill(row, 0);

        for (int i = 0; i <= n ; i++)
            dp[i][0] = i;

        for (int j = 0; j <= m ; j++)
            dp[0][j] = j;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m ; j++) {

                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i- 1][j - 1]; // skip both
                }
                else {
                    dp[i][j] = 1 + Math.min(dp[i][j - 1],
                            Math.min(dp[i -1][j], dp[i -1][j - 1]));
                }
            }
        }
        return dp[n][m];
    }


    int function(int i, int j, String word1, String word2, int[][] dp){


        // base case
        if (i == 0) return j;
        if (j == 0) return i;

        if (word1.charAt(i) == word2.charAt(j)) {
            dp[i][j] = function(i - 1, j - 1, word1, word2, dp); // skip both
        }
        else {
         dp[i][j] = 1 + Math.min(function(i, j - 1, word1,word2, dp),
                 Math.min(function(i -1, j, word1, word2, dp), function(i - 1, j - 1, word1, word2, dp)));
        }

        return dp[i][j];
    }
}
