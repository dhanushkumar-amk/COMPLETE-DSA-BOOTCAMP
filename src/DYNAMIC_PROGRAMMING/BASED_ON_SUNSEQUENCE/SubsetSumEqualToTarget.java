package DYNAMIC_PROGRAMMING.BASED_ON_SUNSEQUENCE;

public class SubsetSumEqualToTarget {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };
        int k = 11;
        int n = arr.length;

        // Check if there exists a subset with the given target sum
        if (subsetSumToK(n, k, arr))
            System.out.println("Subset with the given target found");
        else
            System.out.println("Subset with the given target not found");
    }

    static boolean subsetSumToK(int n, int target, int[] arr){

        int[][] dp = new int[n][target + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < target + 1; j++) {
                dp[i][j] = -1;
            }
        }

       return fun(n -1, target, arr, dp);

    }

    private static boolean fun(int index, int target, int[] arr, int[][] dp) {

        // base case
        if (target == 0)
            return true;

        if (index == 0)
            return (arr[0] == target);

        // If the result for this subproblem has already been calculated, return it
        if (dp[index][target] != -1)
            return dp[index][target] == 0 ? false : true;

        boolean notPick = fun(index -1, target, arr, dp);
        boolean pick = false;

        // bounty validation target 3 and arr[i] = 6 means ony taken other wise can't be taken 9 target 3 and the value is 6 maens the value is greater than target so can't taken the target can'br gone on negative
        if (target >= arr[index])
            pick = fun(index - 1, target - arr[index], arr,dp);

        // if boolean means true or false but we need 1 or 0
        dp[index][target] = notPick || pick ? 1 : 0;

        return pick || notPick;

    }
}
