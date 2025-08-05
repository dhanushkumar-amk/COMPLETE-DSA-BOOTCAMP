package STRIVER_SHEET.BINARYSEARCH;

import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,5,6,7};
        System.out.println(Arrays.toString(searchRange(arr, 4)));
    }


    public static int[] searchRange(int[] nums, int target){

    }


    public static int lowerBoundIndex(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;


        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }



}
