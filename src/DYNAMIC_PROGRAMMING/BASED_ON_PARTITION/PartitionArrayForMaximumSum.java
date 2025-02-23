package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;

import java.util.Arrays;

public class PartitionArrayForMaximumSum {

    public static void main(String[] args) {
        PartitionArrayForMaximumSum answer = new PartitionArrayForMaximumSum();
        int[] arr = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;

        System.out.println("The maximum sum is: " + answer.maxSumAfterPartitioning(arr, k));

    }

    public int maxSumAfterPartitioning(int[] arr, int k) {

        int n = arr.length;

        int[]dp = new int[n];
        Arrays.fill(dp, -1);

        return function(0, arr, k, dp);
    }

    private int function(int index, int[] arr, int k, int[] dp){

        int n = arr.length;

        // base case
        if (index == n)
            return 0;

        if (dp[index] != -1)
            return dp[index];

        int length = 0;
        int maximum = Integer.MIN_VALUE;
        int maximumAnswer = Integer.MIN_VALUE;

        for (int j = index; j < Math.min(n, index + k); j++) {
            length++;
            maximum = Math.max(maximum, arr[j]);
            int sum = length * maximum + function(j + 1, arr, k, dp);
            maximumAnswer = Math.max(maximumAnswer, sum);
        }
        return dp[index] =  maximumAnswer;
    }

}
