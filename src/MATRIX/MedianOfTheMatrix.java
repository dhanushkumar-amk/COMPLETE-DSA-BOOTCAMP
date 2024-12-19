package MATRIX;

public class MedianOfTheMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {5,11,20,35,45},
                {1,2,3,4,6},
                {13,15,16,19,21},
        };

        System.out.println(median1(arr));
    }

    static int median1(int[][] arr){

        int min = arr[0][0];
        int max = arr[0][0];
        int medianPosition = (arr.length * arr[0].length + 1) / 2 ;  // (row * column + 1)/2  in an matrix

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

            for (int i = 0; i < arr.length ; i++) {
                int tempCount = findCount(arr[i], mid);
                count += tempCount;
            }

            if (count < medianPosition)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }



    // to travel the single single row in an matrix
    private static int findCount(int[] arr, int mid) {
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] <= mid)
                count++;
            else
                break;
        }
        return count;
    }
}
