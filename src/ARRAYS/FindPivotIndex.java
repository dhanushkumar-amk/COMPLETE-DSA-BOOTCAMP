package ARRAYS;

// leetcode : 724
// https://leetcode.com/problems/find-pivot-index/description/

public class FindPivotIndex {

    public static void main(String[] args) {
        FindPivotIndex answer = new FindPivotIndex();

        int[] nums = {1,7,3,6,5,6};
        System.out.println(answer.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) {

        // init the rightSum and leftSum
        int rightSum = 0;
        for(int num : nums)
            rightSum += num;

        int leftSum = 0;

        // iterate every element in an array
        for (int i = 0; i < nums.length; i++) {

            int currentValue = nums[i];
            rightSum -= currentValue;

            if (leftSum == rightSum)
                return i;

            // update the leftSum next iteration
            leftSum += currentValue;
        }
        return -1;
    }
}
