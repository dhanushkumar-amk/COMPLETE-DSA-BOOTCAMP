package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;

// leetcode 132
// https://leetcode.com/problems/palindrome-partitioning-ii/

import java.util.Arrays;

public class PalindromePartitioningII {

    public static void main(String[] args) {

        PalindromePartitioningII answer = new PalindromePartitioningII();
        String str = "BABABCBADCEDE";
        System.out.println(answer.tabulation(str));

    }

    public int minCut(String s) {
        int n = s.length();

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return function(0, s, dp) - 1;
    }

    private int function(int i, String s, int[] dp){

        int n = s.length();

        if (i == n)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int minimumCost = Integer.MAX_VALUE;

        for (int j = i; j < n ; j++) {
            if (isPalindrome(i, j, s)) {
               int cost = 1 + function(j + 1, s, dp);
                minimumCost = Math.min(cost, minimumCost);
            }
        }
    return dp[i] = minimumCost;
    }

    private boolean isPalindrome(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }


    // tabulation
    public int tabulation(String s){
        int n = s.length();

        int[] dp = new int[n + 1];

        // base case
        dp[n] = 0;

        for (int i = n - 1; i <= 0 ; i++) {
            int minimumCost = Integer.MAX_VALUE;

            for (int j = i; j < n ; j++) {
                if (isPalindrome(i, j, s)) {
                    int cost = 1 + dp[j + 1];
                    minimumCost = Math.min(cost, minimumCost);
                }
            }
            dp[i] = minimumCost;
        }
        return dp[0] - 1;
    }
}
