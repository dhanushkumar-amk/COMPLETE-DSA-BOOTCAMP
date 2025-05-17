package SLIDING_WINDOW_AND_POINTERS;

// leetcode : 75
// https://leetcode.com/problems/sort-colors/description/?envType=daily-question&envId=2025-05-17

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        SortColors answer = new SortColors();
        int[] nums = {2,0,2,1,1,0};
        answer.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int j = 0;
        int k = nums.length - 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                nums[j] = 0;
                j++;
            }

            if (nums[i] == 2) {
                nums[k] = 2;
                k--;
            }
        }

        for (int i = j + 1; i < k; i++) {
            if (nums[i] != 1)
                nums[i] = 1;
            else
                continue;
        }


    }
}