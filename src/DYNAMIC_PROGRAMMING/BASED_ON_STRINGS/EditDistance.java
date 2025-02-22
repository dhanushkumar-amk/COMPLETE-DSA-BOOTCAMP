package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

// leetcode 72
// https://leetcode.com/problems/edit-distance/

import java.util.Arrays;

public class EditDistance {

    public static void main(String[] args) {
        String s1 = "dinitrophenylhydrazine";
        String s2 = ";

        EditDistance answer = new EditDistance();


        System.out.println("The minimum number of operations required is: " +
               answer.minDistance(s1, s2));
    }


    public int minDistance(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n][m];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return function(n -1, m - 1, word1, word2, dp);

    }

    int function(int i, int j, String word1, String word2, int[][] dp){


        // base case
        if (i < 0) return j + 1;
        if (j < 0) return i + 1;

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
