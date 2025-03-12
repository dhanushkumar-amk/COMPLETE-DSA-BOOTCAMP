package SEARCHING;


// leetcode 2529
// MaximumCountOfPositiveIntegerAndNegativeInteger

public class MaximumCountOfPositiveIntegerAndNegativeInteger {

    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 0, 1,2,3,4,5};

        MaximumCountOfPositiveIntegerAndNegativeInteger answer = new MaximumCountOfPositiveIntegerAndNegativeInteger();

        System.out.println(answer.maximumCount(nums));
    }

//    public int maximumCount(int[] nums) {
//        int positiveCount = 0;
//        int negativeCount = 0;
//
//        for (int i = 0; i < nums.length ; i++) {
//
//            if (nums[i] > 0)
//                positiveCount++;
//            else if(nums[i] < 0)
//                negativeCount++;
//            else
//                continue;
//        }
//
//        return Math.max(positiveCount, negativeCount);
//    }

    // efficient way
    public int maximumCount(int[] nums){

        int n = nums.length;

        int lowerBound = lower(nums, 0);
        int upperBound = upper(nums, 0);

        return Math.max(lowerBound, n - upperBound);
    }

    private int upper(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right){
            int mid = left + right / 2;

            if (nums[mid] <= target)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    private int lower(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right){
            int mid = left + right / 2;

            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }



}
