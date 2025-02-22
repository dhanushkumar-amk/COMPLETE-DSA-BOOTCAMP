package DYNAMIC_PROGRAMMING.BASED_ON_STOCKS;

public class BestTimeToBuyAndSellStockIi {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockIi answer = new BestTimeToBuyAndSellStockIi();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(answer.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        return function(0, 1, prices);
    }

    int function(int index, int buy, int[] prices) {
        int n = prices.length;

        // Base case: if index reaches end of prices array, return 0 profit
        if (index == n)
            return 0;

        int profit = 0;
        if (buy == 1) { // If we can buy
            profit = Math.max(
                    -prices[index] + function(index + 1, 0, prices),  // Buy stock
                    function(index + 1, 1, prices)  // Skip this day
            );
        } else { // If we can sell
            profit = Math.max(
                    prices[index] + function(index + 1, 1, prices),  // Sell stock
                    function(index + 1, 0, prices)  // Skip this day
            );
        }

        return profit;
    }
}
