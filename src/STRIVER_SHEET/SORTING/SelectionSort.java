package STRIVER_SHEET.SORTING;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){

        int currentStartIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int minValue = Integer.MAX_VALUE;
            if(arr[i] < minValue)
                minValue = i;

           int temp = arr[currentStartIndex];
           arr[currentStartIndex] = arr[minValue];
           arr[minValue] = temp;

           currentStartIndex++;
        }
    }
}
