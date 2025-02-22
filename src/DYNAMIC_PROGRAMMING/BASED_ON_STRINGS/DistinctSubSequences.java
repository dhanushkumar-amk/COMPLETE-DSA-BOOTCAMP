package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

import java.util.Arrays;

public class DistinctSubSequences {



    public int numDistinct(String s, String t) {

        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n][m];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return function(n -1, m-1, s, t, dp);
    }


    private int function(int i, int j, String string1, String string2, int[][] dp){

        // base case
        if(i < 0)
            return 0;

        if (j < 0)
            return 1;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (string1.charAt(i) == string2.charAt(j)) {

            int leaveOneOnBoth = function(i - 1, j - 1, string1, string2, dp);
            int leaveOneOnS1 = function(i - 1, j, string1, string2, dp);  // s2 is same as bag

            return dp[i][j] =  leaveOneOnBoth + leaveOneOnS1;
        }

        //else
        return dp[i][j] =  function(i -1, j, string1, string2, dp);
    }

}
