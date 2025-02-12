package GRAPH;

public class FloydWarshallAlgorithm {

    public void shortest_distance(int[][] matrix){

        // if matrix has -1 in that means assume a infinite value (there is no value given by edges)
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == -1)
                    matrix[i][j] = (int)(1e9);

                if (i == j)
                    matrix[i][j] = 0;
            }
        }

        // main algo implementation
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }
            }
        }

// before returning the value which has infinity value make it as a -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] ==  (int)(1e9))
                    matrix[i][j] = -1;
            }
        }
    }
}
