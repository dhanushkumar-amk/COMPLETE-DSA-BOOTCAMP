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

        HashSet<ArrayList<String>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
            }
        }

    }

}
