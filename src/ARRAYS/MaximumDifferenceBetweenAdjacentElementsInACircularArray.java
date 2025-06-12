package ARRAYS;



public class MaximumDifferenceBetweenAdjacentElementsInACircularArray {
    public static void main(String[] args) {

        MaximumDifferenceBetweenAdjacentElementsInACircularArray ans = new MaximumDifferenceBetweenAdjacentElementsInACircularArray();
        int[] nums = {1,2,4};
        System.out.println(ans.maxAdjacentDistance(nums));

    }
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int ans = Math.abs(nums[0] - nums[n - 1]);
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, Math.abs(nums[i] - nums[i + 1]));
        }
        return ans;
    }
}