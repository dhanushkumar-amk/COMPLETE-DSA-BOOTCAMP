package ARRAYS;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(maximumSum2(arr));

    }
    static int maximumSum1(int[] arr){
        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }
            sum = 0;
        }
        return maxSum;
    }

    static int maximumSum2(int[] arr){
        int sum = arr[0];
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (sum > 0){
                sum+= arr[i];
            }else{
                sum = arr[i];
            }

            if (sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }
}

