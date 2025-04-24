package SLIDING_WINDOW_AND_POINTERS;


// leetcode 2799
// https://leetcode.com/problems/count-complete-subarrays-in-an-array/description/?envType=daily-question&envId=2025-04-24

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountCompleteSubarraysInAnArray {

    public static void main(String[] args) {
        CountCompleteSubarraysInAnArray ans = new CountCompleteSubarraysInAnArray();
        int[] nums = {1,3,1,2,2};
        System.out.println(ans.countCompleteSubarrays(nums));
    }

    public int countCompleteSubarrays(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        int total = set.size();

        int i = 0;
        int j = 0;
        int answer = 0;
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        while (j < n){
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while(map.size() == total){
                answer += n - j;
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0)
                    map.remove(nums[i]);
            }
            j++;
        }
        return answer;
    }
}
