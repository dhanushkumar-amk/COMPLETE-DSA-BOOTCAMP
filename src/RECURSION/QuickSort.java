package RECURSION;

import java.util.Arrays;


// Arrays.sort() => works as a dual point quicksort O (log n)


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static  void quickSort(int[] arr, int low, int high){

        // base case
        if (low >=high)
            return;

        int start = low;
        int end =  high;

        int mid = start + (end - start)/2;
        int pivot  = arr[mid];


      while (start <= end) {

          while (arr[start] < pivot)
              start++;

          while (arr[end] > pivot)
              end--;


          if (start <= end){
              int temp = arr[start];
              arr[start] = arr[end];
              arr[end] = temp;
              start++;
              end--;
          }
      }

      // if there pivot was correct position then sort two half
      quickSort(arr, low, end);
      quickSort(arr, start, high);

    }

}
