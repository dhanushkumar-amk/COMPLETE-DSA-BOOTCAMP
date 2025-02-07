package GRAPH;


// https://leetcode.com/problems/rotting-oranges/description/
// leetcode 994

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {


    class Pair{
        int row;
        int colum;
        int time;

        public Pair(int colum, int row, int time) {
            this.colum = colum;
            this.row = row;
            this.time = time;
        }
    }

    public  int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> queue = new LinkedList<>();

        int[][] visited = new int[n][m];

        int countFresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2){
                    queue.add(new Pair(i, j, 0));
                    visited[i][j] = 2;
                }
                else
                    visited[i][j] = 0;

                if(grid[i][j] == 1) countFresh++;
            }
        }

        int time = 0;
        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, 1, 0, -1};
        int count = 0;

        while (!queue.isEmpty()){
            int r = queue.peek().row;
            int c = queue.peek().colum;
            int t = queue.peek().time;

            time = Math.max(time, t);
            queue.remove();

            for (int i = 0; i < 4 ; i++) {
                int neighbourRow = r + deltaRow[i];
                int neighbourCol = c + deltaCol[i];

                if (neighbourRow >= 0 && neighbourRow < n && neighbourCol >= 0 && neighbourCol < m && visited[neighbourRow][neighbourCol] != 2 && grid[neighbourRow][neighbourCol] == 1){
                    queue.add(new Pair(neighbourRow, neighbourCol, t+1));
                    visited[neighbourRow][neighbourCol] = 2;
                    count++;
                }
            }
        }

        if (count != countFresh)
            return -1;

        return time;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0,1,2},
                {0,1,1},
                {2,1,1},
        };

        RottingOranges answer = new RottingOranges();
        int rotting = answer.orangesRotting(grid);
        System.out.println("Minimum Number of Minutes Required "+rotting);
    }
}

