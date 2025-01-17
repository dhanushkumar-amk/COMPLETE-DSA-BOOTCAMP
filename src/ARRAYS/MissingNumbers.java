package ARRAYS;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = arr.length;
        System.out.println(missingNumbers(arr, n));
    }

    static int missingNumbers(int[] arr, int n){

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += arr[i];
        }

        int actualSum = n * (n + 1)/2;
        int missingNumber = actualSum - sum;
        return missingNumber;
    }
}
