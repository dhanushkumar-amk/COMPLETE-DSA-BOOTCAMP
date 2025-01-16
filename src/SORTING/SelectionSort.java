package SORTING;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};

        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            // find the max value in remaining array and swap it as a correct index
            int last = arr.length - i - 1;
            int max = 0;
            for (int j = 0; j < last; j++) {
                if (arr[max] < arr[i]){
                    max = i;
                }
            }
            // swap max index with last index
                int temp = arr[last];
                arr[last] = arr[max];
                arr[max] = temp;
        }
    }

 /*   private static int getMaxIndex(int[] arr, int start, int end) {
        int max = 0;
        for (int i = start; i <end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    */

}
