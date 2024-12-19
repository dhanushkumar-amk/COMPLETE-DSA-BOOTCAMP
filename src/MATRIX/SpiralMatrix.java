package MATRIX;

import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr= {
            {1,2,3,4,5,6,7,8},
            {9,10,11,12,13,14,15,16},
            {17,18,19,20,21,22,23,24},
            {25,26,27,28,29,30,31,32},
            {33,34,35,36,37,38,39,40},
            {41,42,43,44,45,46,47,48},
         };

        List<Integer> spiralOrder = spiralOrder(arr);
        System.out.println(spiralOrder);
    }

    static List<Integer> spiralOrder(int[][] arr){

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        
    }
}
