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

        int target = 5;
        System.out.println(isPresent(arr, target));
    }

    static boolean isPresent(int[][] arr, int target){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] == target)
                    return true;
            }
        }
        return false;
    }


    // efficient solution

    
}
