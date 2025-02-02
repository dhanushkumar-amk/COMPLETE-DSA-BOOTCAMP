package ARRAYS;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        ArrayList<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 4)
            return result;

        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum < target)
                        left++;
                    else if (sum > target)
                        right--;
                    else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);

                        while (left < right && nums[left] == list.get(2))
                            left++;

                        while (left < right && nums[right] == list.get(3))
                            right--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
