package GRAPH;


// // https://leetcode.com/problems/find-minimum-time-to-reach-last-room-ii/description/
//  leetcode : 3341

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindMinimumTimeToReachLastRoomII {
    public static void main(String[] args) {

    }

    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;

        int[][] visited = new int[n][m];
        for(var row : visited)
            Arrays.fill(row, Integer.MAX_VALUE);

        visited[0][0] = 0;


        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> a[0]- b[0]);
        priorityQueue.offer(new int[] {0,0,0});

        int[] directions  = {-1, 0, 1, 0, -1};
        while (!priorityQueue.isEmpty()){

            int[] minElement = priorityQueue.poll();

            int totalTime = minElement[0];
            int row = minElement[1];
            int col = minElement[2];

            if (row == n - 1 && col == m - 1)
                return totalTime;

            if (totalTime > visited[row][col])
                continue;

            for (int i = 0; i < 4; i++) {
                int newRow = row + directions[i];
                int newCol = col + directions[i + 1];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m) {
                    int time = Math.max(moveTime[newRow][newCol], visited[row][col]) + (newRow + newCol) + 1;

                    if (visited[newRow][newCol] > time) {
                        visited[newRow][newCol] = time;
                        priorityQueue.offer(new int[] {time, newRow, newCol});
                    }
                }
            }
        }
        return -1;
    }
}