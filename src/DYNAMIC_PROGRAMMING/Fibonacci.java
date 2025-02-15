package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        //System.out.println(fibo(n, dp));

        fibo1(n, dp);

    }

    // memoization concept
    public static int fibo(int n, int[] dp){

        // base case
        if (n <= 1)
            return n;

        if (dp[n] != -1)
            return dp[n];

        return dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);

    }

    // tabulation concept
    public static void fibo1(int n, int[] dp){
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
    }


    public static void fibo2(int n){

        int previous1 = 0;
        int previous2 = 1;
        int cur
        for (int i = 2; i <= n ; i++) {

        }
        System.out.println();
    }



}
