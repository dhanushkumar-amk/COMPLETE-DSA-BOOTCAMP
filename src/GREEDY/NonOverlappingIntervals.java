package GREEDY;


// leetcode : 435
// https://leetcode.com/problems/non-overlapping-intervals/description/

import java.util.*;

public class NonOverlappingIntervals {

    public static void main(String[] args) {
        int[][] intervals = {
                {1,2},
                {2,3},
                {3,4},
                {1,3},
        };

        NonOverlappingIntervals answer = new NonOverlappingIntervals();
        System.out.println(answer.eraseOverlapIntervals(intervals));
    }

    public int eraseOverlapIntervals(int[][] intervals) {

        // base case
        if (intervals.length == 0)
            return 0;

        // sort the intervals based on en endTime
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int count = 1;
        int previousInterval = 0;

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] >= intervals[previousInterval][1]) {
                previousInterval = i;
                count++;
            }
        }
        return  intervals.length - count;
    }
}
