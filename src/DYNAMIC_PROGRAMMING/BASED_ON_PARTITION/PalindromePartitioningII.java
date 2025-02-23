package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;

// leetcode 132
// https://leetcode.com/problems/palindrome-partitioning-ii/

import java.util.Arrays;

public class PalindromePartitioningII {

    public static void main(String[] args) {

        PalindromePartitioningII answer = new PalindromePartitioningII();
        String str = "BABABCBADCEDE";
        System.out.println(answer.minCut(str));

    }

    public int minCut(String s) {
        int n = s.length();

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return function(0, s);
    }

    private int function(int i, String s){

        int n = s.length();

        if (i == n)
            return 0;

        int minimumCost = Integer.MAX_VALUE;

        for (int j = i; j < n ; j++) {
            if (isPalindrome(i, j, s)) {
               int cost = 1 + function(j + 1, s);
                minimumCost = Math.min(cost, minimumCost);
            }
        }
    return minimumCost;
    }

    private boolean isPalindrome(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
