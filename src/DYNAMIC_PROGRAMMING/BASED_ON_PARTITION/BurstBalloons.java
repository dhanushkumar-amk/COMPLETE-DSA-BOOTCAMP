package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;


// https://leetcode.com/problems/burst-balloons/description/
// leetcode : 312

import java.util.Arrays;

public class BurstBalloons {

    public static void main(String[] args) {

        BurstBalloons answer = new BurstBalloons();
        int[] arr = {3,1,5,8};
        System.out.println(answer.maxCoins(arr));

    }

    public int maxCoins(int[] nums) {

        int m = nums.length;
        int[] newArray = new int[m+2];

        // create the array and add the 1 on both end
        for(int i=0; i<m; i++){
            newArray[i+1] = nums[i];
        }
        newArray[0] = 1;
        newArray[m+1] = 1;


        int[][] dp = new int[m + 1][m + 1];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return function(1, m, newArray, dp);
    }

    private int function(int i, int j, int[] arr, int[][] dp){

        // base case
        if (i > j)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int maximumCoins  = Integer.MIN_VALUE;

        for (int index = i; index <= j; index++) {
            int coins = arr[i - 1] * arr[index] * arr[j + 1]
                    + function(i, index - 1, arr, dp)
                    + function(index + 1, j, arr, dp)
                    ;

            maximumCoins = Math.max(maximumCoins, coins);
        }

        return dp[i][j] =  maximumCoins;
    }



}
