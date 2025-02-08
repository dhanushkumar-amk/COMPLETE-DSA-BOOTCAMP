package GRAPH;

//leetcode 1020
// https://leetcode.com/problems/number-of-enclaves/description/


import java.util.LinkedList;
import java.util.Queue;

public class NumberOfEnclaves {

    class Pair{
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }


    public int numEnclaves(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        Queue<Pair> queue = new LinkedList<>();

        int[][] visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == m - 1){
                    if (matrix[i][j] == 1){
                        queue.add(new Pair(i, j));
                        visited[i][j] = 1;
                    }
                }
            }
        }

        int[] deltaRow = {-1,0, 1, 0};
        int[] deltaCol = {0,-1, 0, 1};

        while (!queue.isEmpty()){

            int row = queue.peek().first;
            int col = queue.peek().second;
            queue.remove();

            for (int i = 0; i < 4; i++) {
                int neighbourRow = row + deltaRow[i];
                int neighbourCol = col + deltaCol[i];

                if(neighbourRow >= 0 && neighbourRow < n && neighbourCol >= 0 && neighbourCol < m && visited[neighbourRow][neighbourCol] == 0 && matrix[neighbourRow][neighbourCol] == 1){
                    queue.add(new Pair(neighbourRow, neighbourCol));
                    visited[neighbourRow][neighbourCol] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0 && matrix[i][j] == 1)
                    count++;
            }
        }
        return count;
    }


    public static void main(String[] args)
    {
        int[][] matrix = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}};

        NumberOfEnclaves ob = new NumberOfEnclaves();
        int ans = ob.numEnclaves(matrix);
        System.out.println(ans);
    }
}
