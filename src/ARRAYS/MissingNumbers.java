package ARRAYS;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {0,4,5,2,1};
        System.out.println(missingNumbers(arr));
    }

    static int missingNumbers(int[] nums){

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        int actualSum = nums.length * (nums.length + 1) / 2;
        int missingNum = actualSum - sum;

        return missingNum;
    }
}
