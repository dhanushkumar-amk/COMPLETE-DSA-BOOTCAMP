package GREEDY;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {

    public static void main(String[] args) {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};

        System.out.println(minMovesToSeat(seats, students));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {

        Arrays.sort(seats);
        Arrays.sort(students);

        int answer = 0;
        for (int i = 0; i < seats.length; i++) {
            answer += Math.abs(seats[i] - students[i]);
        }
        return answer;
    }
}

/*
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int n = seats.length;
        int moves = 0;
        //     Arrays.sort(seats);
        //     Arrays.sort(students);
        //     for(int i=0; i<n; i++){
        //         int max = Math.max(seats[i],students[i]);
        //         int min = Math.min(seats[i],students[i]);
        //         moves += (max - min);
        //     }
        //     return moves;
        int[] seat = new int[101];
        int[] student = new int[101];
        for(int i=0; i<n; i++){
            seat[seats[i]]++;
            student[students[i]]++;
        }
        int seatIdx = 1;
        int studentIdx = 1;
        int m = seat.length;

        for(int i=0; i<n; i++){
            while(seatIdx < m && seat[seatIdx] == 0) seatIdx++;
            while(studentIdx < m && student[studentIdx] == 0) studentIdx++;
            if(seatIdx >= m) break;
            if(studentIdx >= m) break;

            moves += Math.max(seatIdx,studentIdx) - Math.min(seatIdx,studentIdx);
            seat[seatIdx]--;
            student[studentIdx]--;
        }
        return moves;
    }
}
 */