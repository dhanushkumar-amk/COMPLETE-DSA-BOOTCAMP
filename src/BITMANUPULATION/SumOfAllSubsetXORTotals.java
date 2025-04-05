package BITMANUPULATION;

// leetcode 1863
// https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/?envType=daily-question&envId=2025-04-05

public class SumOfAllSubsetXORTotals {

    public static void main(String[] args) {
        SumOfAllSubsetXORTotals answer = new SumOfAllSubsetXORTotals();
        int[] nums = {5,1,6};
        System.out.println(answer.subsetXORSum(nums));
    }

    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int xorValue = 0;
        for(int element : nums)
            xorValue = xorValue | element;

        return xorValue * (1 << ( n - 1 ));
    }

}
