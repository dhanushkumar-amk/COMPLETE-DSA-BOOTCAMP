package HASHMAPS;

// leetcode : 3375
// https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/description/?envType=daily-question&envId=2025-04-09

import java.util.HashSet;
import java.util.Set;

public class MinimumOperationsToMakeArrayValuesEqualToK {

    public static void main(String[] args) {

        MinimumOperationsToMakeArrayValuesEqualToK answer = new MinimumOperationsToMakeArrayValuesEqualToK();

        int [] nums = {5,2,5,4,5};
        System.out.println(answer.minOperations(nums, 2));

    }


    public int minOperations(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
                if (nums[i] < k)
                    return -1;

                if (nums[i] > k)
                    set.add(nums[i]);
        }
        return set.size();
    }

}
