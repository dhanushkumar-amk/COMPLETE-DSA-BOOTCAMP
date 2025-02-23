package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;

// leetcode 132
// https://leetcode.com/problems/palindrome-partitioning-ii/

import java.util.Arrays;

public class PalindromePartitioningII {

    public static void main(String[] args) {

    }

    public int minCut(String s) {
        int n = s.length();

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return function(0, n, s);
    }

    private int function(int i, String s){

        int n = s.length();

        if (i == n)
            return 0;

        String
        for (int j = i; j < n ; j++) {

        }

    }
}
