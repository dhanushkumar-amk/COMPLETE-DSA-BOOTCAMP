package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfConnectedGraph {
    public int numIslands(char[][] matrix){

        int n = matrix.length;
        int m = matrix[0].length;

        // create the visited matrix
        int[][] visited = new int[n][m];
        int count = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (visited[row][col] == 0 && matrix[row][col] == '1'){
                    count++;
                    bfs(row, col, visited, matrix);
                }
            }
        }
        return count;
    }

    private void bfs(int row, int col, int[][] visited, char[][] matrix) {
        visited[row][col] = 1;

        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(row, col));

        int n = matrix.length;
        int m = matrix[0].length;

        while (!queue.isEmpty()) {
            int r = queue.peek().first;
            int c = queue.peek().first;
            queue.remove();

            // het the neighbour nodes

            for (int deltaRow = -1; deltaRow <= 1; deltaRow++) {
                for (int deltaCol = -1; deltaCol <= 1; deltaCol++) {
                    int neighbourRow = r + deltaRow;
                    int neighbourCol = c + deltaCol;

                    if (neighbourRow >= 0 && neighbourRow < n && neighbourCol >= 0 && neighbourCol < m && matrix[neighbourRow][neighbourCol] == '1' && visited[neighbourRow][neighbourCol] == 0) {
                        visited[neighbourRow][neighbourCol] = 1;
                        queue.add(new Pair(neighbourRow, neighbourCol));
                    }
                }
            }
        }
    }

    class Pair{
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
