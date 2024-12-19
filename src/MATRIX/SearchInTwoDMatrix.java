package MATRIX;

public class SearchInTwoDMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30},
        };

        int target = 20;
        System.out.println(isPresent2(arr, target));
    }

    static boolean isPresent1(int[][] arr, int target){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] == target)
                    return true;
            }
        }
        return false;
    }


    // efficient solution
    static boolean isPresent2(int[][] arr, int target){

        int i = 0;
        int j = arr[0].length -1;

        while(i < arr.length && j >= 0){

            if (arr[i][j] == target)
                return true;
            else if ( target > arr[i][j])
                i++;
            else
                j--;
        }
        return false;
    }

}
