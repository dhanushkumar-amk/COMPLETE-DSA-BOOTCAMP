package DYNAMIC_PROGRAMMING;

public class HouseRobber {


    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        System.out.println(rob(nums));
    }


    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        return helper(n - 1, nums, dp);
    }

    private static int helper(int index, int[] nums, int[] dp) {

        if (index == 0)
            return nums[index];

        if (index < 0)
            return 0;

        if (dp[index] != 1)
            return dp[index];

        int pick = nums[index] + helper(index - 2, nums, dp);
        int notPick = helper(index - 1, nums, dp);

        return dp[index] =  Math.max(pick, notPick);

    }

}
