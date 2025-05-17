package SLIDING_WINDOW_AND_POINTERS;

// leetcode : 75
// https://leetcode.com/problems/sort-colors/description/?envType=daily-question&envId=2025-05-17

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        SortColors answer = new SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};
        answer.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int tmp = nums[low];
                nums[low++] = nums[mid];
                nums[mid++] = tmp;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int tmp = nums[mid];
                nums[mid] = nums[high];
                nums[high--] = tmp;
            }
        }
    }
}