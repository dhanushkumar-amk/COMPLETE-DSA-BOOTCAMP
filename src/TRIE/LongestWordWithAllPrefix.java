package TRIE;

public class LongestWordWithAllPrefix {



    private static   Node root;

    public  LongestWordWithAllPrefix() {
        root = new Node();
    }

    // insert word into the trie

    public static void insert(String word){
        Node node = root;
        for (int i = 0; i <word.length() ; i++) {

            if (!node.containsKey(word.charAt(i)))
                node.put(word.charAt(i), new Node());

            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }


    // boolean check if the word exits or not
    boolean checkIfPrefixExists(String word){
        Node node = root;
        boolean flag = true;
        for (int i = 0; i <word.length(); i++) {
            if (node.containsKey(word.charAt(i))){
                node = node.get(word.charAt(i));

                if (!node.isEnd())
                    return false;
            }
            return false;
        }
        return true;
    }

    public static String completeString(int n, String[] a){
        LongestWordWithAllPrefix obj = new LongestWordWithAllPrefix();

        for (int i = 0; i <n ; i++) {
            obj.insert(a[i]);
        }

        String longest = "";

        for (int i = 0; i < n; i++) {
            if (obj.checkIfPrefixExists(a[i])){
                if (a[i].length() > longest.length())
                    longest = a[i];
                else if(a[i].length() == longest.length() && a[i].compareTo(longest) < 0)
                    longest = a[i];
            }
        }
        if (longest == "")
            return "None";

        return longest;
    }

    public static void main(String[] args) {
        LongestWordWithAllPrefix trie = new LongestWordWithAllPrefix();
        String[] arr = {"n", "ninja", "ninj","ni", "ninga"};
        int n = arr.length;
        System.out.println(completeString(n, arr));
    }

}

class Node{
    Node[] links = new Node[26];
    boolean flag = false;


    public Node() {
    }

    boolean containsKey(char ch){
        return links[ch - 'a'] != null;
    }

    Node get(char ch){
        return links[ch - 'a'];
    }

    void put(char ch, Node node){
        links[ch - 'a'] = node;
    }

    public void setEnd(){
        flag = true;
    }

    // check if the current reference node is a last node
    public boolean isEnd(){
        return flag;
    }
}
