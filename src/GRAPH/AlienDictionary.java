package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlienDictionary {


    

    public String findDictionary(String[] dictionary, int n, int k){

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            String string1 = dictionary[i];
            String string2 = dictionary[i + 1];

            int length = Math.min(string1.length(), string2.length());

            for (int pointer = 0; pointer < length; pointer++) {
                if (string1.charAt(pointer) != string2.charAt(pointer)){
                    list.get(string1.charAt(pointer) - 'a').add(string2.charAt(pointer) - 'a');
                    break;
                }
            }
        }

        List<Integer> answer = topoSort(k, list);
        String answer

    }
}
