package DYNAMIC_PROGRAMMING;

public class FrogJump1 {
    public static void main(String[] args) {

    }

    static  int jump1(int n, int[] dp){

        // base case
        if (n == 0)
            return 0;

        int left = jump1(n - 1, Math.abs(dp[n] - dp[n - 1]));
    }
}
