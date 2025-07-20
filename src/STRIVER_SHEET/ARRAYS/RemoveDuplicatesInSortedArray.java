package STRIVER_SHEET.ARRAYS;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,6,7,8,9,9,10};

    }

    static int[] removeDuplicates(int[] arr){

        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        int[] ans = new int[set.size() + 1];

        for (int i = 0; i < set.size(); i++) {
            arr[i] = set.
        }



    }
}