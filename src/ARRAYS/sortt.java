package ARRAYS;

public class sortt {

    public boolean divideArray(int[] nums) {

        int n = nums.length;

        for (int i = 1; i <= n ; i++) {
            if (nums[i] != nums[i - 1])
                return false;
        }
        return true;
    }
}
