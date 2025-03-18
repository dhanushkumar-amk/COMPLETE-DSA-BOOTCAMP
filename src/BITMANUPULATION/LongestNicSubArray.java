package BITMANUPULATION;

// https://leetcode.com/problems/longest-nice-subarray/description/?envType=daily-question&envId=2025-03-18
// leetcode : 2401

public class LongestNicSubArray {

    public int longestNiceSubarray(int[] nums) {

        int n = nums.length;
        int left = 0;
        int right = 0;

        int maxWindowSize = 0;
        int currentSum = 0;
        int xorSum = 0;

        while (right < n){

            currentSum += nums[right];
            xorSum ^= nums[right];

            while (xorSum != currentSum){
                currentSum -= nums[left];
                xorSum ^= nums[left];
                left++;
            }
            maxWindowSize = Math.max(maxWindowSize, right - left + 1);
            right++;
        }
        return maxWindowSize;
    }

}
