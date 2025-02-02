package ARRAYS;

// https://leetcode.com/problems/4sum/
// leetcode 18

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> fourSum(int[] nums, int target) {

        ArrayList<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length == 0)
            return result;

        int n = nums.length;;
        Arrays.sort(nums);

        for (int i = 0; i <n; i++) {
            for (int j = i + 1; j < n; j++) {
                int remaining = target - nums[i] - nums[j];

                int left = j + 1;
                int right = n - 1;

                while (left > right) {
                    int leftAndRightSum = nums[left] + nums[right];

                    if (leftAndRightSum < remaining)
                        left++;
                    else if (leftAndRightSum > remaining)
                        right--;
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);

                        //removing the duplicates of 3
                        while (left < right && nums[left] == list.get(2))
                            ++left;

                        //duplicates of 4
                        while (left < right && nums[right] == list.get(3))
                            ++right;
                    }
                }
                while (j + 1 < n && nums[j + 1] == nums[j])
                    ++j;
            }
            while (i+ 1 < n && nums[i + 1] == nums[i])
                ++i;
        }
        return result;
    }
}
