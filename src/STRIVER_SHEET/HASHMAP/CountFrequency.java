package STRIVER_SHEET.HASHMAP;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {

    }

    static int countFreq(int[] arr, int n){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(i, hashMap.getOrDefault(hashMap.get(i) + 1), 0);
        }



    }

}
