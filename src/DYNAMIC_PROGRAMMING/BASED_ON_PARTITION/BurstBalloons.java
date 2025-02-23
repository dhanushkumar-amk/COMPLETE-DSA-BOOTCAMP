package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;


// https://leetcode.com/problems/burst-balloons/description/
// leetcode : 312

public class BurstBalloons {

    public int maxCoins(int[] nums) {

        int m = nums.length;
        int[] newArray = new int[m+2];

        for(int i=0; i<m; i++){
            newArray[i+1] = nums[i];
        }
        newArray[0] = 1;
        newArray[m+1] = 1;

        return function(1, n, newArray);

    }

    private int function(int i, int j, int[] arr){

        // base case
        if (i > j)
            return 0;

        int maximumCoins  = Integer.MIN_VALUE;

        for (int index = i; index <= j; index++) {
            int cost =
        }

    }



}
