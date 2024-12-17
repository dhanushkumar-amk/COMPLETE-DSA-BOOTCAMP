package ARRAYS;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-1,3,4,-2};
        System.out.println(maximumSum(arr));

    }
    static int maximumSum(int[] arr){
        int maxSum = 0;


        for (int i = 0; i <arr.length ; i++) {
            int sum = 0;
            for (int j = i; j < arr.length ; j++) {
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }

        }
        return maxSum;
    }
}
