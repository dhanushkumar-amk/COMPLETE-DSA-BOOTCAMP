package STRIVER_SHEET.ARRAYS;

import java.util.Arrays;

public class SortArrayByZerosAndOnesAndTwos {
    public static void main(String[] args) {
    int[] arr = {1,2,0,0,2,2,1,2,1,0};
    sort(arr);
    for(int num : arr){
        System.out.print(num + " ");
    }
    }

    static void sort(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high){
            if(arr[mid] == 0){
                arr[mid] = arr[mid] ^ arr[low];
                arr[low] = arr[mid] ^ arr[low];
                arr[mid] = arr[mid] ^ arr[low];
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }else{
                arr[mid] = arr[mid] ^ arr[high];
                arr[high] = arr[mid] ^ arr[high];
                arr[mid] = arr[mid] ^ arr[high];
                high--;
            }
        }
    }

}
