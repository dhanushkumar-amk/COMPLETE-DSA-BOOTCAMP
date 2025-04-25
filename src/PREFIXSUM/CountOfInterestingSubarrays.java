package PREFIXSUM;

// https://leetcode.com/problems/count-of-interesting-subarrays/description/?envType=daily-question&envId=2025-04-25
// leetcode 2845

import  java.util.*;

public class CountOfInterestingSubarrays {

    public static void main(String[] args) {
        CountOfInterestingSubarrays answer = new CountOfInterestingSubarrays();
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(4);
        int modulo = 2;
        int k = 1;
        System.out.println(answer.countInterestingSubarrays(nums, modulo, k));
    }

    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
       int n = nums.size();

       Map<Integer, Integer> map = new HashMap<>();
       map.put(0,1);

       long answer = 0;
       int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (nums.get(i) % modulo == k) ? 1 : 0;
            sum %= modulo;

            int sp = (sum - k + modulo) % modulo;
            answer += map.getOrDefault(sp, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return answer;
    }

}
