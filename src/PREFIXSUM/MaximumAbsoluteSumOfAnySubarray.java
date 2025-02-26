package PREFIXSUM;

// leetcode :
//

public class MaximumAbsoluteSumOfAnySubarray {

    public int maxAbsoluteSum(int[] nums){

        int minSum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int maximumAbsoluteSum = 0;

        for(int num : nums){

            currentSum += num;

            maximumAbsoluteSum = Math.max(maximumAbsoluteSum, Math.max(Math.abs(currentSum - minSum), Math.abs(currentSum - maxSum)))
        }
    }
}
