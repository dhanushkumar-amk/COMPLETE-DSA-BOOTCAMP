package BITMANUPULATION;


// leetcode : 3191
// https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/description/?envType=daily-question&envId=2025-03-19

public class MinimumOperationsToMakeBinaryArrayElementsEqualToOneI {

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,0};
        MinimumOperationsToMakeBinaryArrayElementsEqualToOneI answer = new MinimumOperationsToMakeBinaryArrayElementsEqualToOneI();
        System.out.println(answer.minOperations(nums));
    }

    public int minOperations(int[] nums) {
        int n = nums.length;
        int operationsCount = 0;

        for (int i = 0; i < n - 2; i++) { // k = 3 so n - 2
            if (nums[i] == 1)
                continue;

            flipAllElementsInWindows(nums, i);
            operationsCount++;
        }

        if (nums[n - 2] == 0 || nums[n - 1] == 0)
            return -1;

        return operationsCount;

    }

    private void flipAllElementsInWindows(int[] nums, int i) {
        nums[i] ^= 1;
        nums[i + 1] ^= 1;
        nums[i + 2] ^= 1;
    }
}
