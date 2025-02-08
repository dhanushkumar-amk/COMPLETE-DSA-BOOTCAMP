package GRAPH;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class NumberOfDistrictIsland {


    class Pair{
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int countDistinctIslands(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;


        int[][] visited = new int[n][m];

        HashSet<ArrayList<String>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0 && matrix[i][j] == 1){
                    ArrayList<String> list = new ArrayList<>();
                    dfs(i, j, visited, list,matrix, i , j);
                    set.add(list);
                }
            }
        }
    return set.size();
    }

    private void dfs(int row, int col, int[][] visited, ArrayList<String> list, int[][] matrix, int baseRow, int baseCol) {

        visited[row][col] = 1;
        list.add(toString(row - baseRow, col - baseCol));

        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, -1, 0, 1};

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < 4; i++) {

            int neighbourRow = row + deltaRow[i];
            int neighbourCol = col + deltaCol[i];

            if (neighbourRow >= 0 && neighbourRow < n && neighbourCol >= 0 && neighbourCol < m && visited[neighbourRow][neighbourCol] == 0 && matrix[neighbourRow][neighbourCol] == 1) {
                
            }
        }




    }
    private String toString ( int row, int col){
        return Integer.toString(row) + " " + Integer.toString(col);
    }
}