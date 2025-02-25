package PREFIXSUM;

public class PrefixSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] answer = prefixSum(arr);
        for (int i = 0; i < answer.length; i++) {
            System.out.print( i + " " + " " + answer[i] + " ");
        }
    }

    static int[] prefixSum(int[] arr){

        // create the prefix sum array with same size as arr
        int[] prefixSumArray = new int[arr.length];

        // assign the first element as sam
        prefixSumArray[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + arr[i];
        }

        return prefixSumArray;
    }
}
