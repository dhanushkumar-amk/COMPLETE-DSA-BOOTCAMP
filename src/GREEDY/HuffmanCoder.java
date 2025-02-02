package GREEDY;

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

    public HuffmanCoder(String feeder) throws Exception {

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i <feeder.length() ; i++) {
            char character = feeder.charAt(i);

        }
    }
}
