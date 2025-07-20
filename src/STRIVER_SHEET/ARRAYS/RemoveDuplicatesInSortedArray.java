package STRIVER_SHEET.ARRAYS;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,6,7,8,9,9,10};
        int range = removeDuplicates(arr);
        for (int i = 0; i < range; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; ++j) {
            if(arr[i] != arr[j]){
                arr[i + 1]  = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}