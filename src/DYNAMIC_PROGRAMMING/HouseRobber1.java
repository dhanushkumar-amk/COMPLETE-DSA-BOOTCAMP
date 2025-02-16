package DYNAMIC_PROGRAMMING;


// https://leetcode.com/problems/house-robber/description/
// leetcode 198

import java.util.Arrays;

public class HouseRobber1 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob2(nums));
    }


    // memorization
    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n - 1, nums, dp);
    }

    private static int helper(int index, int[] nums, int[] dp) {

        if (index == 0)
            return nums[index];

        if (index < 0)
            return 0;

        if (dp[index] != -1)
            return dp[index];

        int pick = nums[index] + helper(index - 2, nums, dp);
        int notPick = helper(index - 1, nums, dp);

        return dp[index] =  Math.max(pick, notPick);
    }


    // space optimization problem
    static int rob2(int[] nums){

        int n = nums.length;

        // -1, 0, 1 previous1 = 0 and previous2 -1
        int previous1 = nums[0];
        int previous2 = 0;

        for (int i = 1; i < n; i++) {

            // pick means = i - 2;
            int pick = nums[i];
            if (i > 1)
                pick+= previous2;

            // just go i - 1
            int notPick = previous1;

            int current = Math.max(pick, notPick);
            previous2 = previous1;
            previous1 = current;
        }

        // 5,6,7, n; n= i answer is i -1 is previous1
        return previous1;

    }

}
