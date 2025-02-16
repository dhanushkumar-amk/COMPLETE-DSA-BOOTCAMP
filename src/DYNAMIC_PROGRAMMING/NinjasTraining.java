package DYNAMIC_PROGRAMMING;

public class NinjasTraining {

    static int f(int day, int last, int[][] points, int[][] dp) {

        if (dp[day][last] != -1)
            return dp[day][last];
    }
}
