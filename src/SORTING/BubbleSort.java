package SORTING;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int[] arr = {3,1,5,4,2};
    System.out.println("Before sorting \t = \t" + Arrays.toString(arr));

    bubbleSort(arr);
    System.out.println("After sorting \t = \t"+Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){

        // run the steps n - 1 times
        for (int i = 0; i < arr.length; i++) {
            // for each  steps the max items comes to the end
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }



}