package GREEDY;

// https://leetcode.com/problems/count-days-without-meetings/description/?envType=daily-question&envId=2025-03-24
// leetcode 3169

import java.util.Arrays;

public class CountDaysWithoutMeeting {

    public static void main(String[] args) {
        int[][] meetings = {
                {5, 7},
                {1, 3},
                {9, 10},
        };

        int days = 10;
        CountDaysWithoutMeeting answer = new CountDaysWithoutMeeting();

        System.out.println(answer.countDays(days, meetings));


    }

    public int countDays(int days, int[][] meetings) {
        int n = meetings.length;
        int answer = 0;

        Arrays.sort(meetings);

        int last = 1;
        for (int i = 0; i < n; i++) {
            int start = meetings[i][0];
            int end = meetings[i][1];

            if (start > last){
                if (i == 0)
                    answer += (start - last);
                else
                    answer += (start - last - 1);
            }
            last = Math.max(last, end);
        }

        if (days > last)
            answer += (days - last);


        return answer;
    }
}
