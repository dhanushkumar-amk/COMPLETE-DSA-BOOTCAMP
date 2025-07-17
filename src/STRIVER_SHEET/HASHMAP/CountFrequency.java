package STRIVER_SHEET.HASHMAP;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,3,4,4,5,5};
        countFreq(arr);
    }

    static void countFreq(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " -> Frequency: " + entry.getValue());
        }
    }

}
