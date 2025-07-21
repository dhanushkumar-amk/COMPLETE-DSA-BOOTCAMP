package STRIVER_SHEET.ARRAYS;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};

        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        int n = arr.length;

        int sumOfNaturalNumber = (n * (n + 1) / 2);

        int actualSum = 0;
        for (int i = 0; i < arr.length; ++i) {
            actualSum += arr[i];
        }

        return actualSum - sumOfNaturalNumber;
    }
}
