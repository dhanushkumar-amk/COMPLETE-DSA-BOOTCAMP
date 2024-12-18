package ARRAYS;

public class MaximumSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {2,9,31,-4,21,7};
        int k = 3;
        System.out.println(sum1(arr, k));
    }

    static int sum1(int[] arr, int k){

        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k ; i++) {
            int CurrentSum  = 0;
            for (int j = i; j <= k ; j++) {
                CurrentSum += arr[j];
                MaxSum = Math.max(CurrentSum, MaxSum);
            }
        }

        return MaxSum;
    }
}
