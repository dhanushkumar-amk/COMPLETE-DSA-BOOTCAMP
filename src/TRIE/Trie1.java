package TRIE;

public class LongestWordWithAllPrefix {

    private static Node root;

    public LongestWordWithAllPrefix() {
        root = new Node();
    }

    // Insert word into the trie
    public static void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!node.containsKey(ch))
                node.put(ch, new Node());
            node = node.get(ch);
        }
        node.setEnd();
    }

    // Check if all prefixes of a word exist in Trie
    public static boolean checkIfPrefixExists(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.containsKey(ch)) {
                node = node.get(ch);
                if (!node.isEnd()) // If any prefix is missing, return false
                    return false;
            } else {
                return false;
            }
        }
        return true;
    }

    // Find the longest word with all prefixes present
    public static String completeString(int n, String[] words) {
        root = new Node(); // Initialize root

        // Insert all words into the Trie
        for (String word : words) {
            insert(word);
        }

        String longest = "";
        for (String word : words) {
            if (checkIfPrefixExists(word)) {
                // Choose the longest word or lexicographically smaller if equal in length
                if (word.length() > longest.length() ||
                        (word.length() == longest.length() && word.compareTo(longest) < 0)) {
                    longest = word;
                }
            }
        }

        return longest.isEmpty() ? "None" : longest;
    }

    public static void main(String[] args) {
        String[] arr = {"n", "ninja", "ninj", "ni", "ninga"};
        int n = arr.length;
        System.out.println(completeString(n, arr)); // Output: "ninja"
    }
}

// Trie Node class
class Node {
    private final Node[] links = new Node[26];
    private boolean flag = false;

    boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    Node get(char ch) {
        return links[ch - 'a'];
    }

    void put(char ch, Node node) {
        links[ch - 'a'] = node;
    }

    void setEnd() {
        flag = true;
    }

    boolean isEnd() {
        return flag;
    }
}
