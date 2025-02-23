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

    public int maxCoins1(int[] nums) {

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


//    tabulation
    public int maxCoins(int[] nums) {

        int n = nums.length;
        int[] newArray = new int[n+2];

        // create the array and add the 1 on both end
        for(int i=0; i<n; i++){
            newArray[i+1] = nums[i];
        }
        newArray[0] = 1;
        newArray[n+1] = 1;


        int[][] dp = new int[n + 1][n + 1];


        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n ; j++) {

                if (i > j)
                    continue;

                // copy and paste recurance
                int maximumCoins  = Integer.MIN_VALUE;

                for (int index = i; index <= j; index++) {
                    int coins = newArray[i - 1] * newArray[index] * newArray[j + 1]
                            + dp[i][index - 1]
                            + dp[index + 1][j];
                            ;

                    maximumCoins = Math.max(maximumCoins, coins);
                }
                dp[i][j] = maximumCoins;
            }
        }

        return dp[1][n];
    }

}
