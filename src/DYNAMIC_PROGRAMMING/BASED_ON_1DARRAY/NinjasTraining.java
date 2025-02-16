package DYNAMIC_PROGRAMMING.BASED_ON_1DARRAY;

import java.util.Arrays;

public class NinjasTraining {

    public static void main(String args[]) {
        // Define the points for each activity on each day
        int[][] points = {{10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}};

        int n = points.length; // Get the number of days
        System.out.println(ninjaTraining(n, points)); // Calculate and print the maximum points
    }

    static int ninjaTraining(int n, int[][] points) {

        int[][] dp = new int[n][4];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return f(n - 1, 3, points, dp);
    }


    static int f(int day, int last, int[][] points, int[][] dp) {

        if (dp[day][last] != -1)
            return dp[day][last];

        // base case
        if (day == 0) {
            int maximum = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last)
                    maximum = Math.max(maximum, points[0][i]);
            }
            return dp[day][last] = maximum;
        }

        int maximum = 0;
        // Loop through the three activities on the current day
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                // current day point + previous days points
                int activity = points[day][i] + f(day - 1, i, points, dp);
                maximum = Math.max(maximum, activity);
            }
        }
        return dp[day][last] = maximum;
    }
}
