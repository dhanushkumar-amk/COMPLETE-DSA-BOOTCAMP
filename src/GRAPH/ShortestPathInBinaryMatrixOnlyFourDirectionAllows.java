package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrixOnlyFourDirectionAllows {
    class Pair{
        int first;
        int second;
        int third;

        public Pair(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

   public int shortestPath(int[][] matrix, int[] source, int[] destination){

        // base cae
        // if source and destination is same then distance 0
        if (source[0] == destination[0] && source[1] == destination[1])
            return 0;

        Queue<Pair> queue = new LinkedList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        // create the distance matrix fill with infinite value
        int[][] distanceMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                distanceMatrix[i][j] = (int)(1e9);
            }
        }

        // distance of source is = 0  and add source element with distance as 0 in queue
        distanceMatrix[source[0]][source[1]] = 0;
        queue.add(new Pair(0, source[0], source[1]));

        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, -1, 0, 1};

        while (!queue.isEmpty()){
            Pair iterator = queue.peek(); // get as first pair of [distance, row, col]
            queue.remove();

            int distance = iterator.first;
            int row = iterator.second;
            int col = iterator.third;

            // travel four directions
            for (int i = 0; i < 4; i++) {
                int neighbourRow = row + deltaRow[i];
                int neighbourCol = col + deltaCol[i];

            // validation check
                if (neighbourRow >= 0 && neighbourRow < n && neighbourCol >= 0 && neighbourCol < m && matrix[neighbourRow][neighbourCol] == 1 && distance + 1 < distanceMatrix[neighbourRow][neighbourCol]){
                    distanceMatrix[neighbourRow][neighbourCol] = 1 + distance;
                    if (neighbourRow == destination[0] && neighbourCol == destination[1])
                        return distance + 1;

                    queue.add(new Pair(distance + 1, neighbourRow, neighbourCol));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ShortestPathInBinaryMatrixOnlyFourDirectionAllows answer = new ShortestPathInBinaryMatrixOnlyFourDirectionAllows();

        int[][] matrix = {
                {1,1,1,1},
                {1,1,0,1},
                {1,1,1,1},
                {1,1,0,0},
                {1,0,0,0},
        };

        int[] source = {0, 1};
        int[] destination ={2,2};

        System.out.println(answer.shortestPath(matrix, source, destination));
    }
}
