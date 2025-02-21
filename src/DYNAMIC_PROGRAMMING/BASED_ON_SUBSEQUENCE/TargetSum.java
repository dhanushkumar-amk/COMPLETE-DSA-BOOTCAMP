package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

// leetcode 494
// https://leetcode.com/problems/target-sum/

import java.util.Arrays;

public class TargetSum {

    public int findTargetSumWays(int[] arr, int target) {
      
        int n = arr.length;
        
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        // Checking for edge cases
        if (totalSum - target < 0)
            return 0;
        if ((totalSum - target) % 2 == 1)
            return 0;


        int s2 = (totalSum - target) / 2;

        int[][] dp = new int[n][s2 + 1];


        for (int[] row : dp)
            Arrays.fill(row, -1);


        return function(n - 1, s2, arr, dp);
    }


    static int function(int index, int target, int[] arr, int[][] dp) {

        if (index == 0) {
            if (target == 0 && arr[0] == 0)
                return 2;

            if (target == 0 || target == arr[0])
                return 1;
            
            return 0;
        }

        if (dp[index][target] != -1)
            return dp[index][target];


        int notTaken = function(index - 1, target, arr, dp);

        int taken = 0;

        if (arr[index] <= target)
            taken = function(index - 1, target - arr[index], arr, dp);


        return dp[ind][target] = (notTaken + taken);

}
