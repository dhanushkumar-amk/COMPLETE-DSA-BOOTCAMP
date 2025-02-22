package DYNAMIC_PROGRAMMING.BASED_ON_STOCKS;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// leetcode 

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int minimumPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
        int cost =  prices[i] - minimumPrice;
            profit = Math.max(profit, cost);
            minimumPrice = Math.min(minimumPrice, prices[i]);
        }
        return profit;
    }
}
