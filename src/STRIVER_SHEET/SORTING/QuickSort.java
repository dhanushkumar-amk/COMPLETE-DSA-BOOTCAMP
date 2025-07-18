package STRIVER_SHEET.SORTING;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 7, 4, 8, 1, 3, 8};
        int[] ans = quickSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] quickSort(int[] arr) {
        qs(arr, 0, arr.length - 1);
        return arr;
    }

    private static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partitionFunction(arr, low, high);
            qs(arr, low, partitionIndex - 1);
            qs(arr, partitionIndex + 1, high);
        }
    }

    private static int partitionFunction(int[] arr, int low, int high) {
        int pivot = arr[low]; // Correct: pivot is value, not index
        int i = low;
        int j = high;

        while (i < j) {
            // Move i to the right until arr[i] > pivot
            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            // Move j to the left until arr[j] <= pivot
            while (j >= low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at its correct position
        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }
}
