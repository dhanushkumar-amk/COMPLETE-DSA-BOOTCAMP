package SEARCHING;


// leetcode 2529
// MaximumCountOfPositiveIntegerAndNegativeInteger

public class MaximumCountOfPositiveIntegerAndNegativeInteger {

    public static void main(String[] args) {

    }

    public int maximumCount(int[] nums) {
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < nums.length ; i++) {

            if (nums[i] > 0)
                positiveCount++;
            else if(nums[i] < 0)
                negativeCount++;
            else
                continue;
        }

        return Math.max(positiveCount, negativeCount);
    }
}
