package DYNAMIC_PROGRAMMING.BASED_ON_STOCKS;

public class BestTimeToBuyAndSellStock3 {


    public int maxProfit(int[] prices) {

        return function(0);
    }

    int function(int index, int buy, int transaction, int[] price, int[][] dp){

        int n = price.length;

        // base case
        if (index == n || transaction == 0)
            return 0;

        if (buy)

    }

}
