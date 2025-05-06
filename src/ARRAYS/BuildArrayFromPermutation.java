package ARRAYS;

// https://leetcode.com/problems/build-array-from-permutation/description/?envType=daily-question&envId=2025-05-06
//leetcode : 1920

import java.util.Arrays;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        BuildArrayFromPermutation answer = new BuildArrayFromPermutation();
        int[] nums = {0,2,1,5,3,4};

        int[] result  = answer.buildArray(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        for (int num : nums)
    }

}
