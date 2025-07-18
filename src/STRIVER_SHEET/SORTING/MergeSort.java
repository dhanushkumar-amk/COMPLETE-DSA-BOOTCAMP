package STRIVER_SHEET.SORTING;


import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,5,1,4,3,2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low >= high)
            return;

        int mid = low + high / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid , high);



    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();


        int left = low;
        int right = mid + 1;


        while (low <= mid && right <= high){
            if(arr[left] <= arr[right]){
               temp.add(arr[left]);
               left++;
            }else{
                temp.add(arr[right]);
                right++;    
            }
        }
    }


}
