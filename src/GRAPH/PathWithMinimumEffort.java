package GRAPH;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PathWithMinimumEffort {

    class Pair{
        int row;
        int col;
        int distance;

        public Pair(int distance, int row, int col) {
            this.col = col;
            this.distance = distance;
            this.row = row;
        }
    }

    public int minimumEffortPath(int[][] heights) {

        int n = heights.length;
        int m = heights[0].length;

        // create distance array fill with infinity value
        int[][] distanceArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                distanceArray[i][j] = (int) (1e9);
            }
        }


        // create the queue
        PriorityQueue<Pair> queue = new PriorityQueue<>((x, y) -> x.distance - y.distance);

        // init the src values as o and put it as a queue
        distanceArray[0][0] = 0;
        queue.add(new Pair(0, 0,0));

        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, -1, 0, 1};

        while (!queue.isEmpty()){

            Pair iterator = queue.peek();
            int difference = iterator.distance;
            int row = iterator.row;
            int col = iterator.col;
            queue.remove();

            // checks and return as an answer
            if (row == n - 1 && col == n - 1)
                return difference;

            for (int i = 0; i < 4; i++) {
                int neighbourRow = row + deltaRow[i];
                int neighbourCol = row + deltaCol[i];

                if (neighbourRow >= 0 && neighbourRow < n && neighbourCol >= 0 && neighbourCol < m){
                    int newEffort = Math.max(Math.abs(heights[row][col] - heights[neighbourRow][neighbourCol]), difference);
                    if (newEffort < distanceArray[neighbourRow][neighbourCol]){
                        distanceArray[neighbourRow][neighbourCol] = newEffort;
                        queue.add(new Pair(newEffort, neighbourRow, neighbourCol));
                    }
                }
            }
        }

        return 0;
    }
}

/*
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;

        // Directions for moving in 4 directions (right, down, left, up)
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        // Min heap (Priority Queue) to process the least effort path steps
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        // Effort matrix to store the minimum effort required to reach each cell
        int[][] effort = new int[rows][cols];
        for (int[] row : effort) Arrays.fill(row, Integer.MAX_VALUE);
        effort[0][0] = 0;

        pq.offer(new int[]{0, 0, 0}); // {effort, row, col}

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currEffort = current[0];
            int row = current[1];
            int col = current[2];

            // If we reach the bottom-right cell, return the minimum effort
            if (row == rows - 1 && col == cols - 1) {
                return currEffort;
            }

            // Explore all 4 possible directions
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    int diff = Math.abs(heights[row][col] - heights[newRow][newCol]);
                    int maxEffort = Math.max(currEffort, diff);

                    // If this path offers a smaller effort, update and push it to the queue
                    if (maxEffort < effort[newRow][newCol]) {
                        effort[newRow][newCol] = maxEffort;
                        pq.offer(new int[]{maxEffort, newRow, newCol});
                    }
                }
            }
        }
        return 0; // This line is never reached
    }
}
 */
