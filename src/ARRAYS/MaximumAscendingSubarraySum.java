package ARRAYS;

// leetcode 1800
//https://leetcode.com/problems/maximum-ascending-subarray-sum/description/

public class MaximumAscendingSubarraySum {
    public static void main(String[] args) {

    }

    public int maxAscendingSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int iteSum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[j + 1])
                    iteSum += nums[j];
            }
            sum = Math.max(sum, iteSum);
        }

        return sum;
    }
}