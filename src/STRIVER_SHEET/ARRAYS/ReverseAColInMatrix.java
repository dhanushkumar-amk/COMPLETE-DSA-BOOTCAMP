package STRIVER_SHEET.ARRAYS;

public class ReverseAColInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,6,11,16,21},
                {2,7,12,17,22},
                {3,8,13,18,23},
                {4,9,14,19,24},
                {5,10,15,20,25},
        };

        System.out.println("Before reverse : \n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("After reverse : \n");
        reverseMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void reverseMatrix(int[][] matrix){

    }
}
