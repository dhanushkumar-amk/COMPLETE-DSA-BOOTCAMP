package DYNAMIC_PROGRAMMING.BASED_ON_SUNSEQUENCE;

public class SubsetSumEqualToTarget {

    static boolean subsetSumToK(int n, int target, int[] arr){


        int[][] dp = new int[n][target + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = 
            }
        }

       return fun(n -1, target, arr);



    }

    private static boolean fun(int index, int target, int[] arr) {

        // base case
        if (target == 0)
            return true;

        if (index == 0)
            return (arr[0] == target);

        boolean notPick = fun(index -1, target, arr);
        boolean pick = false;

        // bounty validation target 3 and arr[i] = 6 means ony taken other wise can't be taken 9 target 3 and the value is 6 maens the value is greater than target so can't taken the target can'br gone on negative
        if (target >= arr[index])
            pick = fun(index - 1, target - arr[index], arr);

        return pick || notPick;

    }
}
