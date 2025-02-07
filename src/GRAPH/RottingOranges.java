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

    public int orangesRotting(int[][] grid) {

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
        while (!queue.isEmpty()){
            int r = queue.peek().row;
            int c = queue.peek().colum;
            
        }

    }


}

