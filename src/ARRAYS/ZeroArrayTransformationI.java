package ARRAYS;

// leetcode 3355
// https://leetcode.com/problems/zero-array-transformation-i/?envType=daily-question&envId=2025-05-20

public class ZeroArrayTransformationI {
    public static void main(String[] args) {
    ZeroArrayTransformationI ans = new ZeroArrayTransformationI();
    int[] nums = {1,0,1};
    int[][] queries = {{0, 2}};
        System.out.println(ans.isZeroArray(nums,queries));
    }

    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] difference = new int[n + 1];
        for(var query : queries){
            int start = query[0];
            int end  = query[1];

            difference[start]++;
            difference[end + 1]--;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += difference[i];
            if (sum <nums[i])
                return false;
        }
        return true;
    }
}