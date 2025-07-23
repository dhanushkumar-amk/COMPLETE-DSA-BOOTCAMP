package STRIVER_SHEET.ARRAYS;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTime(arr));
    }


    static  int bestTime(int[] arr){
        int minimum = arr[0];
        int MaxProfit = 0;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int cost = arr[i] - minimum;
            MaxProfit = Math.max(cost, MaxProfit);
            minimum = Math.min(minimum, arr[i]);
        }
        return MaxProfit;
    }
}
