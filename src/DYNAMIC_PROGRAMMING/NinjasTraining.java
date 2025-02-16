package DYNAMIC_PROGRAMMING;

public class NinjasTraining {

    static int f(int day, int last, int[][] points, int[][] dp) {

        if (dp[day][last] != -1)
            return dp[day][last];

        if (day == 0) {
            int maximum = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last)
                    maximum = Math.max(maximum, points[0][i]);
            }
            return dp[day][last] = maximum;
        }
        

    }
}
