package ARRAYS;

public class CountEqualAndDivisiblePairsInAnArray {

    public static void main(String[] args) {
        CountEqualAndDivisiblePairsInAnArray ans = new CountEqualAndDivisiblePairsInAnArray();
        int[] nums = {3,1,2,2,2,1,3};
        System.out.println(ans.countPairs(nums,2));
    }

    public int countPairs(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    if (i * j % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
