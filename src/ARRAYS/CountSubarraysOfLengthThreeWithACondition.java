package ARRAYS;


// leetcode : 3392
// https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/description/?envType=daily-question&envId=2025-04-27

public class CountSubarraysOfLengthThreeWithACondition {

    public static void main(String[] args) {
        CountSubarraysOfLengthThreeWithACondition answer = new CountSubarraysOfLengthThreeWithACondition();
        int[] nums = {1,2,1,4,1};
        System.out.println(answer.countSubarrays(nums));
    }

    public int countSubarrays(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 1; i <n - 2; i++) {
            if (2 * (nums[i - 1] + nums[ i + 1])== nums[i])
                count++;
        }
        return count;
    }
}
