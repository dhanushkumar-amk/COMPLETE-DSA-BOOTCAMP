package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;

public class MatrixChainMultiplication {

    static int matrixMultiplication(int[] arr){

        int n = arr.length;

        int[][] dp = new int[n][]

        return function(1, n - 1, arr);
    }

    static int function(int i, int j, int[] arr){

        // base case
        if (i == j)
            return 0;

        int minimumSteps = Integer.MAX_VALUE;
        for (int k = i; k < j - 1; k++) {
            int steps = arr[i -1] * arr[k] * arr[j] + function(i, k-1, arr) + function(k , j, arr);

            if (steps < minimumSteps)
                minimumSteps = steps;
        }
        return minimumSteps;
    }
}
