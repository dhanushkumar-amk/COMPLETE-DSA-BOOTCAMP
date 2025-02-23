package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;

public class PartitionArrayForMaximumSum {

    public static void main(String[] args) {
        PartitionArrayForMaximumSum answer = new PartitionArrayForMaximumSum();
        int[] arr = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;

        System.out.println("The maximum sum is: " + answer.maxSumAfterPartitioning(arr, k));

    }

    public int maxSumAfterPartitioning(int[] arr, int k) {

        int n = arr.length;
        return function(0, arr, k);
    }

    private int function(int index, int[] arr, int k){

        int n = arr.length;

        // base case
        if (index == n)
            return 0;

        int length = 0;
        int maximum = Integer.MIN_VALUE;
        int maximumAnswer = Integer.MIN_VALUE;

        for (int j = index; j < Math.min(n, index + k); j++) {
            length++;
            maximum = Math.max(maximum, arr[j]);
            int sum = length * maximum + function(j + 1, arr, k);
            maximumAnswer = Math.max(maximumAnswer, sum);
        }
        return maximumAnswer;
    }

}
