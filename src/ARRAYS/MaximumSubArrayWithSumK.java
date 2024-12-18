package ARRAYS;

public class MaximumSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {2,9,31,-4,21,7};
        int k = 3;
        System.out.println(sum2(arr, k));
    }

    static int sum1(int[] arr, int k){

        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k ; i++) {
            int CurrentSum  = 0;
            for (int j = i; j < i + k ; j++) {
                CurrentSum += arr[j];
                MaxSum = Math.max(CurrentSum, MaxSum);
            }
        }

        return MaxSum;
    }


    // efficient solution  using sliding windows
    static int sum2(int[] arr, int k){

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < k ; i++) {
            windowSum += arr[i];
        }

        for (int i = k; i < arr.length ; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}
