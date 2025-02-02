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

        public Node(Character data, int cost) {
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

        //step 3 create the min heap and insert the value as a set
        Heap<Node> minHeap = new Heap<>();
        Set<Map.Entry<Character, Integer>> entrySet = frequency.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet){
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }

        // step 4 remove the two nodes and combine into one
        while (minHeap.size() != 1){
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }

        //step 5 create the full tree
        Node fullTree = minHeap.remove();

        // fill it into encoder and decoder
        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initEncoderDecoder(fullTree, "");

    }

    private void initEncoderDecoder(Node node, String output) {

        if (node == null)
            return;

        // if go in the leaf node and add the data into it an hashmaps
        if (node.left == null && node.right == null){
            this.encoder.put(node.data, output);
            this.decoder.put(output, node.data);
        }

        // go left and right , fo left add 0 to all and right 1 to all
        initEncoderDecoder(node.left, output + "0");
        initEncoderDecoder(node.right, output + "1");
    }

    // encode the function
    public String encode(String source){
        String answer = "";

        for (int i = 0; i <source.length() ; i++) {
            answer = answer + encoder.get(source);
        }

        return answer;
    }

    // decode function
    public String decode(String codedString){
        String key = "";
        String answer = "";
        for (int i = 0; i <codedString.length() ; i++) {
            key += codedString.charAt(i);

                // get the key pairs
            if (decoder.containsKey(key)){
                answer = answer + decoder.get(key);
                key = ""; // key will be reset
            }
        }
        return answer;
    }

    class Main{
        public static void main(String[] args) throws Exception {
            String str = "abbccda";
            HuffmanCoder coder = new HuffmanCoder(str);
            String cs = coder.encode(str);
            String ds = coder.decode(str);

            System.out.println(cs);
            System.out.println(ds);

        }
    }

}
