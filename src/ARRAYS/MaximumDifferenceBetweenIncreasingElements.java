package ARRAYS;

public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        MaximumDifferenceBetweenIncreasingElements ans = new MaximumDifferenceBetweenIncreasingElements();
        int[] nums = {7,1,5,4};
        System.out.println(ans.maximumDifference(nums));

    }
    public int maximumDifference(int[] nums) {
    int ans = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            int max = Integer.MIN_VALUE;
            if(nums[i] < nums[i + 1]){
                max = Math.max(max, nums[i] -)
            }

        }
    }
}
