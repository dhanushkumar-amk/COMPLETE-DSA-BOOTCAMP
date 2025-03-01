package ARRAYS;


// leetcode 2640
// https://leetcode.com/problems/apply-operations-to-an-array/description/?envType=daily-question&envId=2025-03-01


public class ApplyOperationsToAnArray {

    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};

        System.out.println();
    }

    public int[] applyOperations(int[] nums) {

        int size = nums.length;
        int index = 0;

        // step 1
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // step 2
        for(int num : nums){
            if (num != 0){
                nums[index] = num;
                index++;
            }
        }

        // step 3
        while (index < size){
            nums[index] = 0;
            index++;
        }

        return nums;
    }
}
