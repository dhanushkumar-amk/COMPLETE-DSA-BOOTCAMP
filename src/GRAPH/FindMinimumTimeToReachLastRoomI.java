package GRAPH;

// https://leetcode.com/problems/find-minimum-time-to-reach-last-room-i/description/?envType=daily-question&envId=2025-05-07
// leetcode : 3341

import java.util.Arrays;

public class FindMinimumTimeToReachLastRoomI {
    public static void main(String[] args) {
    }

    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;

        int[][] visited = new int[n][m];
        for(var row : visited)
            Arrays.fill(row, Integer.MAX_VALUE);

        


    }
}