package GRAPH;

public class WeightedGraphRepresentationInMatrix {
    public static void main(String[] args) {

        int n = 5;
        int m = 6;

        int[][] matrix = new int[n + 1][n + 1];

        matrix[1][2] = 2;
        matrix[2][1] = 2;

        matrix[1][3] = 3;
        matrix[3][1] = 4;

        matrix[3][4] = 5;
        matrix[4][3] = 6;

        matrix[2][4] = 5;
        matrix[4][2] = 7;

        matrix[2][5] = 2;
        matrix[5][2] = 4;

        matrix[4][5] = 5;
        matrix[5][4] = 6;


        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
