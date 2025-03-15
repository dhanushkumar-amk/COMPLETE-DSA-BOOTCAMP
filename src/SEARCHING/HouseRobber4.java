package SEARCHING;


// leetcode 2560
// https://leetcode.com/problems/house-robber-iv/description/?envType=daily-question&envId=2025-03-15

import java.lang.reflect.Array;
import java.util.Arrays;

public class HouseRobber4 {
    public static void main(String[] args) {

    }

    public int minCapability(int[] nums, int k) {

        int low = Arrays.stream(nums).min().getAsInt();
        int high = Arrays.stream(nums).max().getAsInt();

        int answer = 0;
        while (low <= high){
          int mid = low + (high - low)/2;
            if (canAssign(mid, nums, k)){
                answer = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return answer;
    }

    private boolean canAssign(int maximumCapability, int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= maximumCapability){
                count++;
                i++;  // for 2 steps
            }
        }
        return count >= k;
    }
}
