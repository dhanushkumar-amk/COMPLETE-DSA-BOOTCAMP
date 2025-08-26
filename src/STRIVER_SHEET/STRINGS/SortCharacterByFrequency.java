package STRIVER_SHEET.STRINGS;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String  s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(!map.containsKey(ch))
                map.put(ch, 0);

            map.put(ch, map.get(ch) + 1);
        }

        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a, b) -> (map.get(a) - map.get(b)));

        for(char key : map.keySet())
            priorityQueue.add(key);

        StringBuilder ans  = new StringBuilder();

        while (priorityQueue.size() > 0){

            char ch = priorityQueue.poll();
            for (int i = 0; i < map.get(ch); i++) {
                ans.append(ch);
            }

        }


        return  ans.toString();
    }
}
