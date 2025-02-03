package TRIE;

public class Trie2 {
     class Node{

         Node[] links = new Node[26];
         int countEndWith = 0;
         int countPrefix = 0;

         public Node() {
         }

         // contains key function
         boolean containsKey(char ch){
             return links[ch - 'a'] != null;
         }

         // get function
         Node get(char ch){
             return links[ch - 'a'];
         }

         // put function
         void put(char ch, Node node){
             links[ch - 'a'] = node;
         }

         // increase end function
         void increaseEndWith(){
             countEndWith++;
         }

         // prefix count increase function
         void  increasePrefixCount(){
             countPrefix++;
         }

         // delete end function
         void deleteEnd(){
             countPrefix--;
         }

         void reducePrefix(){
             countPrefix--;
         }

         int getEnd(){
             return countEndWith;
         }

         int getPrefix(){
             return countPrefix;
         }

     }

     private Node root;

     Trie2(){
         root = new Node();
     }

     // insert the word into the trie
    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {

            if (!node.containsKey(word.charAt(i)))
                node.put(word.charAt(i), new Node());

            //node goes the reference trie
            node = node.get(word.charAt(i));
            node.increasePrefixCount();
        }
        // on last character means increase end countWidth by one
        node.increaseEndWith();
    }

    // count words equal to function
    public int countWordsEqualTo(String word){
         Node node = root;

        for (int i = 0; i <word.length() ; i++) {

            //if node is present then go to the next reference trie
            if (node.containsKey(word.charAt(i)))
              node =  node.get(word.charAt(i));
            else
                return 0;
        }
        return node.getEnd();
    }

    // count words start with
    public int countWordStartsWith(String word){
         Node node = root;

        for (int i = 0; i <word.length(); i++) {

            if (node.containsKey(word.charAt(i)))
                node =  node.get(word.charAt(i));
            else
                return 0;

        }
        return node.getPrefix();
    }

    //erase function
    public void erase(String word){

         Node node = root;
        for (int i = 0; i < word.length(); i++) {

            if (node.containsKey(word.charAt(i))){
                node = node.get(word.charAt(i));
                node.reducePrefix();
            }
            else return;
        }
        node.deleteEnd();
    }
}
