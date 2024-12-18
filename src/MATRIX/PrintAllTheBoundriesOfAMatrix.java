package MATRIX;

public class PrintAllTheBoundriesOfAMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
        };


        int i=0;
        int j=0;

        // print left to right
        for (j = 0; j <arr[i].length ; j++) {
            System.out.print(arr[i][j] + " ");
        }


        j = arr.length -1;
        for (i = 1; i < arr.length  ; i++) {
            System.out.print(arr[i][j] +" ");
        }

        i = arr.length - 1;
        for ( j = arr[i].length - 2; j >= 0 ; j--) {
            System.out.print(arr[i][j] + " ");
        }

        j = 0;
        for ( i = arr[i].length - 2; i >= 1; i--) {
            System.out.print(arr[i][j] +" ");
        }
    }
}
