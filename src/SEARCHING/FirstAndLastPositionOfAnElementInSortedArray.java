package SEARCHING;

import java.util.Arrays;

public class FirstAndLastPositionOfAnElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,6,7};
        int target = 4;
        System.out.println(Arrays.toString(position(arr, target)));
    }
    static int[] position(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        int mid = 0;

        int[] res = {-1, -1};
        while (low <= high){
            mid = (low + high)/2;

            if (arr[mid] == target){
                res[0] = mid ;
                high = mid -1;
            }

            if (target < arr[mid]){
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }


        // reinit
        low = 0;
        high = arr.length -1;
        mid =  0;

        while (low <= high){
            mid = (low + high)/2;

            if (arr[mid] == target){
                res[1] = mid ;
                low = mid +1;
            }

            if (target < arr[mid]){
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
    return  res;
    }
}
