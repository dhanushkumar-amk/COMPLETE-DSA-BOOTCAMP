package DYNAMIC_PROGRAMMING.BASED_ON_STOCKS;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        
    }

    public static int maxProfit(int[] prices) {

        int minimumPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
        int cost = minimumPrice - prices[i];
            profit = Math.max(profit, cost);
            minimumPrice = Math.min(minimumPrice, prices[i]);
        }
        return profit;
    }
}
