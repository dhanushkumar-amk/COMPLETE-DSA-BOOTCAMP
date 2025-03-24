package GREEDY;

import java.util.Arrays;

public class CountDaysWithoutMeeting {
    public static void main(String[] args) {
        int[][] meetings = {
                {5, 7},
                {1, 3},
                {9, 10}
        };

        int days = 10;
        CountDaysWithoutMeeting answer = new CountDaysWithoutMeeting();

        System.out.println(answer.countDays(days, meetings)); // Expected Output: 4
    }

    public int countDays(int days, int[][] meetings) {
        // Sort meetings by start day
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int freeDays = 0;
        int last = 0;

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            // Count free days between last meeting and current meeting
            if (start > last + 1) {
                freeDays += (start - last - 1);
            }
            last = Math.max(last, end);
        }

        // Count free days after the last meeting
        if (days > last) {
            freeDays += (days - last);
        }

        return freeDays;
    }
}
