package ARRAYS;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};

        System.out.println(missingNumbers(arr));
    }

    static int missingNumbers(int[] arr){

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int actualSum = arr.length * (arr.length + 1)/2;
        int missingNumber = actualSum - sum;
        return missingNumber;
    }
}
