package SLIDING_WINDOW_AND_POINTERS;


// https://leetcode.com/problems/count-the-number-of-fair-pairs/submissions/?envType=daily-question&envId=2025-04-19
// leetcode  2563;

import java.util.Arrays;

public class CountTheNumberOfFairPairs {

    public static void main(String[] args) {

        int[] nums = {0,1,7,4,4,5};

    }

    public long countFairPairs(int[] nums, int lower, int upper){

        Arrays.sort(nums);

        return helper(nums, upper + 1) - helper(nums, lower);

    }

    private  int helper(int[] nums, int target){
        
    }

    /*
    public long countFairPairs(int[] nums, int lower, int upper) {

        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <nums.length ; j++) {
                if (nums[i] + nums[j] >= lower && nums[i] + nums[j] <= upper)
                    sum++;
            }
        }
    return sum;
    }

     */

}
