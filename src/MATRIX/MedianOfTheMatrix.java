package MATRIX;

public class MedianOfTheMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {5,11,20,35,45},
                {1,2,3,4,6},
                {13,15,16,19,21},
        };
    }

    static int median1(int[][] arr){

        int min =arr[0][0];
        int max =arr[0][0];


        for (int i = 0; i < arr.length; i++) {

            // min value
            if (arr[i][0] < min)
                min = arr[i][0];

            // max value
            if (arr[i][arr[0].length - 1] > max)
                max =  arr[i][arr[0].length - 1];
        }



        while(min < max){
            int mid = (min + max)/2;

            int count = 0;
            
        }



    }
}
