package GREEDY;

import HEAPS.Heap;

import java.util.*;
public class HuffmanCoder {

    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable<Node>{

        Character data;
        int cost;
        Node left;
        Node right;

        public Node(int cost, Character data) {
            this.cost = cost;
            this.data = data;
            this.left = null;
            this.right = null;
        }

        // java is confuse so we tell what to compare
        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
        // negative means smaller , 0 means equal, positive means larger
    }

    // step 1 pass the feeder
    public HuffmanCoder(String feeder) throws Exception {

        // step 2 create frequency map
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i <feeder.length() ; i++) {
            char character = feeder.charAt(i);

            // if value already exists then increase the count
            if (frequency.containsKey(character)) {
                int originalValue = frequency.get(character);
                originalValue += 1;
                frequency.put(character, originalValue);
            }else {
                // if does not exit put one
                frequency.put(character, 1);
            }
        }

        //step 3
        Heap<Node> minHeap = new Heap<>();
        Set<Map.Entry<Character, Integer>> entrySet = frequency.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet){
            Node node = new Node(entry.getKey())
        }
    }
}
