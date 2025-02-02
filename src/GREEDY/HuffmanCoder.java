package GREEDY;

import HEAPS.Heap;
import java.util.*;

public class HuffmanCoder {

    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    // Node class for Huffman tree
    private class Node implements Comparable<Node> {
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        // Comparing nodes based on cost
        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    // Constructor to build Huffman Tree
    public HuffmanCoder(String feeder) throws Exception {
        HashMap<Character, Integer> frequency = new HashMap<>();

        // Step 1: Count frequency of each character
        for (int i = 0; i < feeder.length(); i++) {
            char character = feeder.charAt(i);
            frequency.put(character, frequency.getOrDefault(character, 0) + 1);
        }

        // Step 2: Create a min heap
        Heap<Node> minHeap = new Heap<>();
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }

        // Step 3: Build Huffman Tree
        while (minHeap.size() > 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }

        Node fullTree = minHeap.remove();

        // Step 4: Initialize encoder and decoder
        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        initEncoderDecoder(fullTree, "");
    }

    // Recursive method to generate Huffman codes
    private void initEncoderDecoder(Node node, String output) {
        if (node == null) {
            return;
        }

        // If it's a leaf node, store the code
        if (node.left == null && node.right == null) {
            this.encoder.put(node.data, output);
            this.decoder.put(output, node.data);
        }

        // Traverse left and right with '0' and '1'
        initEncoderDecoder(node.left, output + "0");
        initEncoderDecoder(node.right, output + "1");
    }

    // Encoding function
    public String encode(String source) {
        String answer = "";
        for (int i = 0; i < source.length(); i++) {
            answer += encoder.get(source.charAt(i)); // Append Huffman code
        }
        return answer;
    }

    // Decoding function
    public String decode(String codedString) {
        String key = "";
        String answer = "";
        for (int i = 0; i < codedString.length(); i++) {
            key += codedString.charAt(i);

            // Check if the key exists in decoder map
            if (decoder.containsKey(key)) {
                answer += decoder.get(key);
                key = ""; // Reset key
            }
        }
        return answer;
    }

    // Main method to test Huffman coding
    public static void main(String[] args) throws Exception {
        String str = "abbccda";
        HuffmanCoder coder = new HuffmanCoder(str);
        String cs = coder.encode(str);
        String ds = coder.decode(cs);

        System.out.println("Encoded: " + cs);
        System.out.println("Decoded: " + ds);
    }
}