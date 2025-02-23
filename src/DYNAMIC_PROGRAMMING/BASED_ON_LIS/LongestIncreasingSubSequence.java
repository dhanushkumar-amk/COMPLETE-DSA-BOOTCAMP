package DYNAMIC_PROGRAMMING.BASED_ON_LIS;

public class LongestIncreasingSubSequence {


    public int lengthOfLIS(int[] nums) {

        return function(0, -1, nums);

    }

    public int function(int index, int previousIndex,int[] nums){

        int n = nums.length;
        if (index == n)
            return 0;

        int take = Integer.MIN_VALUE;
        // take case
        if (previousIndex == -1 || nums[index] > nums[previousIndex])
            take = 1 + function(index + 1, index, nums);

        // not take
        int notTake = 0 + function(index + 1, previousIndex, nums);

        return Math.max(take, notTake);

    }

}
