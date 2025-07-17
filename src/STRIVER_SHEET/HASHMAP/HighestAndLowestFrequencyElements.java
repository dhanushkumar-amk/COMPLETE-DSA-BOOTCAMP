package STRIVER_SHEET.HASHMAP;

import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFrequencyElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,2,2,2,2,2,2,3,4,4,4};
        freq(arr);

    }

    static void freq(int[] arr){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

       for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
           if(entry.getValue() > maxValue)
               maxValue = entry.getValue();
       }

        System.out.println(maxValue);
    }
}
