package SORTING;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {
    public static void main(String[] args) {
    int[] arr = {3,4,1,3,2,5,2,8};
    System.out.println(Arrays.toString(arr));

    countSort(arr);
//    countSortHashmap(arr);
    System.out.println(Arrays.toString(arr));


    }
    static  void countSort(int[] arr){
        if (arr == null || arr.length <= 1)
            return;

        // find largest element
        int max = Arrays.stream(arr).max().getAsInt();;

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

    // count sort using hashmap
    static void countSortHashmap(int[] arr){
        if (arr == null || arr.length <= 1)
            return;

        int max = Arrays.stream(arr).max().getAsInt();  // to maximum element in array using shortcut
        int min = Arrays.stream(arr).min().getAsInt();  // to minimum element in array using shortcut


        Map<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = map.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}