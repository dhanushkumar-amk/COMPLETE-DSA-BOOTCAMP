package GREEDY;

import HEAPS.Heap;

import java.util.*;

public class HuffmanCoder {

    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

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

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception {
        HashMap<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < feeder.length(); i++) {
            char character = feeder.charAt(i);
            frequency.put(character, frequency.getOrDefault(character, 0) + 1);
        }

        Heap<Node> minHeap = new Heap<>();
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }

        while (minHeap.size() > 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }

        Node fullTree = minHeap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        initEncoderDecoder(fullTree, "");
    }

    private void initEncoderDecoder(Node node, String output) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            this.encoder.put(node.data, output);
            this.decoder.put(output, node.data);
        }

        initEncoderDecoder(node.left, output + "0");
        initEncoderDecoder(node.right, output + "1");
    }

    public String encode(String source) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < source.length(); i++) {
            answer.append(encoder.get(source.charAt(i)));
        }

        return answer.toString();
    }

    public String decode(String codedString) {
        StringBuilder key = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < codedString.length(); i++) {
            key.append(codedString.charAt(i));

            if (decoder.containsKey(key.toString())) {
                answer.append(decoder.get(key.toString()));
                key.setLength(0); // Reset key
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) throws Exception {
        String str = "abbccda";
        HuffmanCoder coder = new HuffmanCoder(str);
        String cs = coder.encode(str);
        String ds = coder.decode(cs);

        System.out.println("Encoded: " + cs);
        System.out.println("Decoded: " + ds);
    }
}
