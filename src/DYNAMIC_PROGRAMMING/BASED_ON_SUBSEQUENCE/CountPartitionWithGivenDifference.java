package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

import java.util.Arrays;

public class CountPartitionWithGivenDifference {

    // Memoization answer
    static int findWays1(int[] arr, int target) {
        int startIndex = arr.length; // Fix: Start from the last index

        int[][] dp = new int[startIndex][target + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return function(startIndex - 1, target, arr, dp);
    }

    static int function(int index, int target, int[] arr, int[][] dp) {
        // Base case: If target is 0, we found a valid subset
        if (target == 0)
            return 1;

        if (index == 0)
            return arr[0] == target ? 1 : 0;


        if (dp[index][target] != -1)
            return dp[index][target];

        int notPick = function(index - 1, target, arr, dp);


        int pick = 0;
        if (arr[index] <= target)
            pick = function(index - 1, target - arr[index], arr, dp);

        return dp[index][target] =  pick + notPick;
    }


    static int countPartition(int n, int d, int[] arr){

        int totalSum = 0;

        for(int it : arr)
            totalSum += it;

        // base case
        if(totalSum - d < 0) return 0;
        if((totalSum - d ) % 2 == 1) return 0;

        int s2 = (totalSum - d ) / 2;
        
    }
}
