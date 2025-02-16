package DYNAMIC_PROGRAMMING;

public class HouseRobber {


    public static void main(String[] args) {
        
    }


    public static int rob(int[] nums) {
        int n = nums.length;
        return helper(n - 1, nums);
    }

    private static int helper(int index, int[] nums) {

        if (index == 0)
            return nums[index];

        if (index < 0)
            return 0;

        int pick = nums[index] + helper(index - 2, nums);
        int notPick = 0 + helper(index - 1, nums);

        return Math.max(pick, notPick);

    }

}
