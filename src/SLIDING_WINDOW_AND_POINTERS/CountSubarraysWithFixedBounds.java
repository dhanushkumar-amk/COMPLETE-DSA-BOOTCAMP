package SLIDING_WINDOW_AND_POINTERS;

// leetcode 2444
// https://leetcode.com/problems/count-subarrays-with-fixed-bounds/description/?envType=daily-question&envId=2025-04-26

public class CountSubarraysWithFixedBounds {
    public static void main(String[] args) {
        CountSubarraysWithFixedBounds answer = new CountSubarraysWithFixedBounds();
        int[] nums = {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;
        System.out.println(answer.countSubarrays(nums, minK, maxK));
    }
    public long countSubarrays(int[] nums, int minK, int maxK) {

        long answer = 0;
        int minIndex = -1;
        int maxIndex = -1;
        int invalidIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxK || nums[i] < minK)
                invalidIndex = i;

            if (nums[i] == minK)
                minIndex = i;

            if (nums[i] == maxK)
                maxIndex = i;

            answer += Math.max((Math.min(minIndex, maxIndex)-invalidIndex), 0);

        }
        return answer;
    }
}
