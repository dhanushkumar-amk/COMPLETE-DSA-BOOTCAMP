package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;


// leetcode 518
// https://leetcode.com/problems/coin-change-ii/

public class CoinChange2 {

    

    public static int change(int amount, int[] coins) {

        int n = coins.length;
        return function(n -1, amount, coins);
    }

    static int function(int index, int target, int[] coins){

        // base case
        if (index == 0){
            if (target % coins[0] == 0)
                return 1;
            else
                return 0;
        }

        int notPick = function(index -1, target, coins);

        int pick = 0;
        if (target <= coins[index])
            pick = function(index , target - coins[index], coins);

        return pick + notPick;
    }

}
