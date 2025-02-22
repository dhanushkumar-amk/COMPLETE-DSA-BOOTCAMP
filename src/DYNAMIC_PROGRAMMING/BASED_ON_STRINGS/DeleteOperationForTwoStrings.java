package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;


//leetcode : 583
// https://leetcode.com/problems/delete-operation-for-two-strings/description/

import java.util.Arrays;

public class DeleteOperationForTwoStrings {

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "anc";

        DeleteOperationForTwoStrings answer = new DeleteOperationForTwoStrings();

        System.out.println("The Minimum operations required to convert str1 to str2: "
                +answer.minDistance(str1, str2));
    }


    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        return n + m - 2 * longestCommonSubsequence(word1, word2);
    }


    // copy and paste
    public  int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m + 1];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return function(n - 1, m -1, text1, text2, dp);
    }

    private  int function(int i, int j, String text1, String text2, int[][] dp) {

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
