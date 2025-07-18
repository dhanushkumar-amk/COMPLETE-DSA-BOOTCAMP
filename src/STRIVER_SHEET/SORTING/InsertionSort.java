package STRIVER_SHEET.SORTING;

import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else break;
            }
        }
    }
}
