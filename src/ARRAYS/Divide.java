package ARRAYS;

public class Divide {

    public boolean divideArray(int[] nums) {

        int n = nums.length;
        int[] freq = new int[nums.length];

        for (int i = 0; i < n; i++) {
            freq[i]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 == 0)
                return true;
        }
        return false;
    }
}
