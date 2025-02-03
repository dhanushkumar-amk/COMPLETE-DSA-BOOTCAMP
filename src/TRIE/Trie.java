package TRIE;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Collections;

public class Trie {

    //  every trie has a root
    private static Node root;

    public Trie(){
        root = new Node();
    }

    // insert function
    public void insert(String word){
        Node node = root;// always starts from root

        // insert every character in word
        for (char i = 0; i <word.length(); i++) {
            if (!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i), new Node());
            }
            // move to the reference trie
            node.get(word.charAt(i));
        }
        // at standing at the last reference trie then we set the flag => true
        node.setEnd();
    }

    // search function (if the word present or not)
    public boolean search(String word){
        Node node = root;

        for (int i = 0; i < word.length(); i++) {

            // if character is not found return false
            if (!node.containsKey(word.charAt(i)))
                return false;

            // otherwise go to the next reference
            node.get(word.charAt(i));
        }

        // if node reaches the last node then word is found
        if (node.isEnd())
            return true;

        return false;
    }

    // words starts with function
    public boolean startsWith(String prefixWord){
        Node node = root;

        for (int i = 0; i < prefixWord.length(); i++) {
            if (!node.containsKey(prefixWord.charAt(i)))
                return false;
            // go to the next
            node.get(prefixWord.charAt(i));
        }
        return true;
    }


    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("help");
        trie.insert("ahelp");
        trie.insert("abox");

        

        System.out.println(trie.search("hello"));
        System.out.println(trie.search("boom"));

        System.out.println(trie.startsWith("hell"));
        System.out.println(trie.startsWith("dha"));
    }



    class Node{
        Node[] links = new Node[26];
        boolean flag = false;

        public Node() {}

        // contains key functions
        // it return true if the character is found , otherwise return false if word not found
        private boolean containsKey(char ch){
            return links[ch - 'a'] != null;
        }

        // put function
        // put create a new node and add the current character of the words to the new node
        private void put(char ch, Node node){
            links[ch - 'a'] = node;
        }

        // get function
        private Node get(char ch){
            return links[ch - 'a'];
        }

        // set flag as true function
        private void setEnd(){
            flag = true;
        }

        // check if the current reference node is a last node
        private boolean isEnd(){
            return flag;
        }
    }
}


