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

            // checks
            if (row == n - 1 && col == n - 1)
                return difference;

            for (int i = 0; i < 4; i++) {
                int neighbourRow = row + deltaRow[i];
                int neighbourCol = row + deltaCol[i];

                if (neighbourRow >= 0 && neighbourRow < n && neighbourCol >= 0 && neighbourCol < m){
                    int newEffort = Math.max(Math.abs(heights[row][col] - heights[neighbourRow][neighbourCol]), difference);
                    
                }

            }

        }

        return 0;
    }
}

