package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;


// leetcode 322
// https://leetcode.com/problems/coin-change/description/


public class CoinChange {


    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        int T = 7;

        // Call the minimumElements function and print the result
        System.out.println("The minimum number of coins required to form the target sum is " + coinChange(arr, T));
    }

    public static int coinChange(int[] coins, int amount) {

        return function(coins.length - 1, coins, amount);
    }

    static int function(int index, int[] coins, int target){

        if (index == 0){
            if (target % coins[0] == 0)
                return target % coins[0];
            else
                return (int) 1e9;
        }

        int notPick = 0 + function(index -1, coins, target);

        int pick = Integer.MAX_VALUE;
        if (coins[index] <)
            pick = 1 + function(index, coins, target - coins[index]);

        return Math.min(pick, notPick);
    }
}
