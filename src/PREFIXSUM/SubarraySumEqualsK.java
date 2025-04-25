package PREFIXSUM;

// https://leetcode.com/problems/subarray-sum-equals-k/description/
// leetcode 560

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        SubarraySumEqualsK ans = new SubarraySumEqualsK();
        int[] nums = {1,1,1};
        int k = 2;

        System.out.println(ans.subarraySum(nums, k));
    }

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int  prefixSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int removeItems = prefixSum - k;
            count += map.get(removeItems);
            map.put(prefixSum, prefixSum+=1);
        }
        return  count;
    }
}
