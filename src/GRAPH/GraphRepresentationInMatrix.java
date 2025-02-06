package GRAPH;

public class GraphRepresentationInMatrix {
    public static void main(String[] args) {

        int n = 5;
        int m = 6;

        int[][] matrix = new int[n + 1][n + 1];

        matrix[1][2] = 1;
        matrix[2][1] = 1;

        matrix[1][3] = 1;
        matrix[3][1] = 1;

        matrix[3][4] = 1;
        matrix[4][3] = 1;

        matrix[2][4] = 1;
        matrix[4][2] = 1;

        matrix[2][5] = 1;
        matrix[5][2] = 1;

        matrix[4][5] = 1;
        matrix[5][4] = 1;


        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
