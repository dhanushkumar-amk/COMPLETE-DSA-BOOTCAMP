package ARRAYS;

public class CountEqualAndDivisiblePairsInAnArray {

    public static void main(String[] args) {
        CountEqualAndDivisiblePairsInAnArray ans = new CountEqualAndDivisiblePairsInAnArray();
        
    }

    public int countPairs(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    if (nums[i] * nums[j] % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
