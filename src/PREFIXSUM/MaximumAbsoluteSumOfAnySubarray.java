package PREFIXSUM;

// leetcode : 1749
//https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/?envType=daily-question&envId=2025-02-26

public class MaximumAbsoluteSumOfAnySubarray {

    public int maxAbsoluteSum(int[] nums){

        int minSum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int maximumAbsoluteSum = 0;

        for(int num : nums){
            currentSum += num;
            maximumAbsoluteSum = Math.max(maximumAbsoluteSum, Math.max(Math.abs(currentSum - minSum), Math.abs(currentSum - maxSum)));

            maxSum =  Math.max(maxSum, currentSum);
            minSum = Math.max(minSum, currentSum);
        }

        return maximumAbsoluteSum;
    }
}
