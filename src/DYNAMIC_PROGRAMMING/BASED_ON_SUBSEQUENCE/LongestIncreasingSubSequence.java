package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

import java.util.Arrays;

public class LongestIncreasingSubSequence {


    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};

        LongestIncreasingSubSequence answer = new LongestIncreasingSubSequence();
        System.out.println(answer.lengthOfLIS(arr));
    }

    public int lengthOfLIS(int[] nums) {

        int n = nums.length;

        int[][] dp = new int[n][n + 1];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return function(0, -1, nums, dp);

    }

    public int function(int index, int previousIndex,int[] nums, int[][] dp){

        int n = nums.length;
        if (index == n)
            return 0;

        if (dp[index][previousIndex + 1] != -1)
            return dp[index][previousIndex + 1];

        int take = Integer.MIN_VALUE;
        // take case
        if (previousIndex == -1 || nums[index] > nums[previousIndex])
            take = 1 + function(index + 1, index, nums, dp);

        // not take
        int notTake = 0 + function(index + 1, previousIndex, nums, dp);

        return dp[index][previousIndex + 1] =  Math.max(take, notTake);

    }


    // tabuulation method

    public static int tabulation(int[] arr){

        int n = arr.length;

        int dp[][]=new int[n+1][n+1];

        for(int ind = n-1; ind>=0; ind --){
            for (int prev_index = ind-1; prev_index >=-1; prev_index --){

                int notTake = 0 + dp[ind+1][prev_index +1];

                int take = 0;

                if(prev_index == -1 || arr[ind] > arr[prev_index]){

                    take = 1 + dp[ind+1][ind+1];
                }

                dp[ind][prev_index+1] = Math.max(notTake,take);

            }
        }

        return dp[0][0];
    }

}
