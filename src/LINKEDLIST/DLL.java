package LINKEDLIST;

public class DLL {
    
    private class Node{

        private int val;
        private Node next;
        private Node prev;

        public Node(Node next, Node prev, int val) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
        }
    }


}
