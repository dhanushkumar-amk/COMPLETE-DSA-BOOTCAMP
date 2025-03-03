package SLIDING_WINDOW_AND_POINTERS;


// https://leetcode.com/problems/partition-array-according-to-given-pivot/?envType=daily-question&envId=2025-03-03
// leetcode : 2126

public class PartitionArrayAccordingToGivenPivot {

    public int[] pivotArray(int[] nums, int pivot) {

        int n = nums.length;

        int[]  result = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = 0, j = n - 1; i < n; i++, j--) {

            if (nums[i] < pivot) {
                result[left] = nums[i];
                left++;
            }

            if (nums[j] > pivot) {
                result[right] = nums[i];
                right--;
            }
        }
            while (left <= right){
                result[left] = pivot;
                left++;
        }

            return result;
    }


}
