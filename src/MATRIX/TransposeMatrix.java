package MATRIX;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
        };
     //   transpose(arr);

        int[][] result = transpose1(arr);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length ; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

         }

    static void transpose(int[][] arr){

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    // return as a arrays

    static int[][] transpose1(int[][] arr){

        int[][] result = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                result[i][j] = arr[j][i] - arr[j][i];
            }
        }
        return result;
    }


    // efficient solution

}
