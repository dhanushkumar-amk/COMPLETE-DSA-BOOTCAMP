package PREFIXSUM;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        SubarraySumEqualsK ans = new SubarraySumEqualsK();
        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(ans.subarraySum(nums, k));
    }

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with prefixSum = 0 having count 1
        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            int target = prefixSum - k;
            count += map.getOrDefault(target, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
