package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;


// https://leetcode.com/problems/burst-balloons/description/
// leetcode : 312

public class BurstBalloons {

    public int maxCoins(int[] nums) {

        int m = nums.length;
        int[] newCuts = new int[m+2];

        for(int i=0; i<m; i++){
            newCuts[i+1] = nums[i];
        }
        newCuts[0] = 0;
        newCuts[m+1] = n;


    }



}
