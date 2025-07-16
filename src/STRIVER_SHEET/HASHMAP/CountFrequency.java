package STRIVER_SHEET.HASHMAP;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {

    }

    static int countFreq(int[] arr, int n){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < hashMap.size(); i++) {

        }



    }

}
