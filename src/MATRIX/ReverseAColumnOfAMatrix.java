package MATRIX;

public class ReverseAColumnOfAMatrix {
    public static void main(String[] args) {
    int[][] arr = {
            {1,6,11,16,21},
            {2,7,12,17,22},
            {3,8,13,18,23},
            {4,9,15,19,24},
            {5,10,15,20,25},
        };

    reverseColumn(arr);

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void reverseColumn(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            int left = 0;
            int right = arr[i].length - 1;

            while(left <= right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }

}
