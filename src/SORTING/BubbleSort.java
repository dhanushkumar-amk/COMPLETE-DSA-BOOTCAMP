package SORTING;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {3,1,5,4,2};
        int[] arr = {1,2,3,4,5};
    System.out.println("Before sorting \t = \t" + Arrays.toString(arr));

    bubbleSort(arr);
    System.out.println("After sorting \t = \t"+Arrays.toString(arr));
    }

    // the swapped value can be used to reduce the comparison of sorted array it already sorted

    static void bubbleSort(int[] arr){
        boolean swapped;
        // run the steps n - 1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each  steps the max items comes to the end
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you don't swap particular value of i its means array is sorted
            if (!swapped)
                break;
        }
    }
}