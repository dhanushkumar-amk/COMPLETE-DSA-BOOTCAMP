package SORTING;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
    int[] arr = {3,4,1,3,2,5,2,8};
    System.out.println(Arrays.toString(arr));

    countSort(arr);
    System.out.println(Arrays.toString(arr));


    }
    static  void countSort(int[] arr){
        if (arr == null || arr.length <= 1)
            return;

        // find largest element
        int  max= arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        // frequency array and it into frequency
        int[] countArray = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            countArray[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while(countArray[i] > 0){
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }
}