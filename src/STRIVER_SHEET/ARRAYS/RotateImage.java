package STRIVER_SHEET.ARRAYS;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,6,11,16,21},
                {2,7,12,17,22},
                {3,8,13,18,23},
                {4,9,14,19,24},
                {5,10,15,20,25},
        };

        System.out.println("Before rotate : \n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("After rotate : \n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    public  static void reverseMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[0].length - 1;

            while (left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }

        }
    }

}
