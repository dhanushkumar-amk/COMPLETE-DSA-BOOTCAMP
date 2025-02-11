package GRAPH;

import java.util.*;

public class ShortestPathInBinaryMatrixOAllDirectionAllows {
    class pair {
        int first;
        int second;
        int third;

        public pair(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

     public int shortestPathBinaryMatrix(int[][] grid) {

            int n = grid.length;
            int m = grid[0].length;

            if(grid[0][0] != 0 || grid[n-1][n-1] != 0)
                return -1;

            if(n-1 == 0)
                return 1;

            int[][] distanceArray = new int[n][m];

            Queue<pair> queue = new LinkedList<>();
            for(int[] i: distanceArray){
                Arrays.fill(i,(int)1e9);
            }

            distanceArray[0][0] = 1;
            queue.add(new pair(1,0,0));

            int[] deltaRow = {0,1,-1,0,1,-1,1,-1};
            int[] deltaCol = {1,0,0,-1,1,1,-1,-1};

            while(!queue.isEmpty()){
                pair iterator = queue.poll();
                int distance = iterator.first;
                int row = iterator.second;
                int col = iterator.third;

                for(int i=0; i<8; i++){
                    int neighbourRow = row + deltaRow[i];
                    int neighbourCol = col + deltaCol[i];

                    if(neighbourRow >=0 && neighbourRow <n && neighbourCol >=0 && neighbourCol < m && grid[neighbourRow][neighbourCol] == 0 && distance +1 < distanceArray[neighbourRow][neighbourCol]){
                        distanceArray[neighbourRow][neighbourCol] = 1 + distance;
                        if(neighbourRow == n-1 && neighbourCol == n-1)
                            return distance + 1;
                        queue.add(new pair(distance +1, neighbourRow, neighbourCol));
                    }
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,1,1},
                {1,0,0,1},
                {1,1,1,0},
                {1,1,0,0},
                {1,0,0,0},
        };

        ShortestPathInBinaryMatrixOAllDirectionAllows answer = new ShortestPathInBinaryMatrixOAllDirectionAllows();
        System.out.println(answer.shortestPathBinaryMatrix(matrix));


    }
}
