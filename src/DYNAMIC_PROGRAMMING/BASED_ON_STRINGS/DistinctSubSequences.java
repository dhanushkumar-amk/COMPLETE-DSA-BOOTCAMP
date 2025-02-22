package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

import java.util.Arrays;

public class DistinctSubSequences {

    static int prime = (int) (Math.pow(10, 9) + 7);

    public static void main(String[] args) {
        DistinctSubSequences answer = new DistinctSubSequences();

        String s1 = "babgbag";
        String s2 = "bag";

        System.out.println("The Count of Distinct Subsequences is " + answer.numDistinct(s1, s2));
    }

    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];  // Use n+1 and m+1 to handle base cases properly

        for (int[] row : dp)
            Arrays.fill(row, -1);  // Initialize DP table with -1

        return function(n, m, s, t, dp);
    }

    private int function(int i, int j, String s, String t, int[][] dp) {
        // Base cases
        if (j == 0) return 1;  // If t is empty, one valid subsequence exists (empty subsequence)
        if (i == 0) return 0;  // If s is empty but t is not, no valid subsequence exists

        if (dp[i][j] != -1)
            return dp[i][j];

        if (s.charAt(i - 1) == t.charAt(j - 1)) {
            int include = function(i - 1, j - 1, s, t, dp);  // Include this character
            int exclude = function(i - 1, j, s, t, dp);  // Skip this character in s
            return dp[i][j] = (include + exclude) % prime;
        } else {
            return dp[i][j] = function(i - 1, j, s, t, dp);  // Exclude and continue
        }
    }
}
