package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

import java.util.Arrays;

public class CountsSumSetWithSumK {

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3};
        int k = 3;

        // Calculate and print the number of subsets that sum up to k
        System.out.println("The number of subsets found are " + findWays1(arr, k));
    }

    // Memoization answer
    static int findWays1(int[] arr, int target) {
        int startIndex = arr.length - 1; // Fix: Start from the last index

        int[][] dp = new int[startIndex][target + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return function(startIndex, target, arr, dp);
    }

    static int function(int index, int target, int[] arr, int[][] dp) {
        // Base case: If target is 0, we found a valid subset
        if (target == 0)
            return 1;

        // Base case: If we've reached the first element
        if (index == 0) {
            if (arr[index] == target) // If the first element equals the target
                return 1;
            else
                return 0;
        }

        if (dp[index][target] != -1)
            return dp[index][target];

        int notPick = function(index - 1, target, arr, dp);


        int pick = 0;
        if (arr[index] <= target)
            pick = function(index - 1, target - arr[index], arr, dp);

        return dp[index][target] =  pick + notPick;
    }
}