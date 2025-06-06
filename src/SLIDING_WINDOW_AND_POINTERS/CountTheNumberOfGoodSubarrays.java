package SLIDING_WINDOW_AND_POINTERS;


//leetcode 2573
// https://leetcode.com/problems/count-the-number-of-good-subarrays/description/?envType=daily-question&envId=2025-04-16

import java.util.HashMap;

public class CountTheNumberOfGoodSubarrays {
    public static void main(String[] args) {

    }

    public long countGood(int[] nums, int k) {

        long n = nums.length;
        long left = 0;
        long right = 0;
        long goodSubarray = 0;
        long equalPairs = 0;

        HashMap<Long, Long>  frequency = new HashMap<>();

        while (left < n){
            while (right < n && equalPairs < k){
                long num = nums[(int)right];
                frequency.put(num, frequency.getOrDefault(num, 0L) + 1);

                if (frequency.get(num) >= 2)
                    equalPairs += frequency.get(num) - 1;

                right++;
            }

            if (equalPairs >= k)
                goodSubarray += n - right + 1;

            // Remove left item
            long leftNum = nums[(int)left];
            frequency.put(leftNum, frequency.get(leftNum) - 1);

            if (frequency.get(leftNum) > 0) {
                equalPairs -= frequency.get(leftNum);
            }

            left++;
        }
    return  goodSubarray;
    }


}
