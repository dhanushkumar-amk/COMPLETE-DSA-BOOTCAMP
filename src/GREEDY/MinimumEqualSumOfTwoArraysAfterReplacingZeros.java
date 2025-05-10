package GREEDY;


// leetcode 2918
// https://leetcode.com/problems/minimum-equal-sum-of-two-arrays-after-replacing-zeros/?envType=daily-question&envId=2025-05-10

public class MinimumEqualSumOfTwoArraysAfterReplacingZeros {
    public static void main(String[] args) {

    }

    public long minSum(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        long sum1 = 0;
        long sum2 = 0;

        int zeroCount1  = 0;
        int zeroCount2  = 0;

        for (int i = 0; i < n1; i++) {
            if (nums1[i] == 0) {
                zeroCount1++;
                nums1[i] = 1;
            }
            sum1 += nums1[i];
        }

        for (int i = 0; i < n2; i++) {
            if (nums2[i] == 0) {
                zeroCount1++;
                nums2[i] = 1;
            }
            sum1 += nums2[i];
        }

        if ((sum1 < sum2 && zeroCount1 == 0) || (sum1 > sum2 && zeroCount2 == 0))
                return -1;

        return Math.max(sum1, sum2);
    }
}
