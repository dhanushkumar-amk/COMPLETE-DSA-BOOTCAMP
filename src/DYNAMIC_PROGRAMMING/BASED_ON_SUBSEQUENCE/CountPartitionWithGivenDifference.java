package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

import java.util.Arrays;

public class CountPartitionWithGivenDifference {

    public static void main(String args[]) {

        int arr[] = {5,2,6,4};
        int d=3;

        System.out.println("The number of subsets found are "+countPartition(d,arr));
    }

    // Memoization answer
    static int countPartition( int d, int[] arr){

        int n = arr.length;

        int totalSum = 0;

        for(int it : arr)
            totalSum += it;

        // base case
        if(totalSum - d < 0) return 0;
        if((totalSum - d ) % 2 == 1) return 0;

        // formula
        int s2 = (totalSum - d ) / 2;

        int[][] dp = new int[n][s2+1];

        for(int[] row: dp)
            Arrays.fill(row,-1);

        return  function(n-1,s2,arr,dp);
    }

    static int mod =(int)(Math.pow(10,9)+7);
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

        return dp[index][target] =  (pick + notPick) % mod;
    }



}
