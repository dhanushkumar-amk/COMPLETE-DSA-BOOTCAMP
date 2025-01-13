package LINKEDLIST;

public class InsertTheElementUsingRecursion {

    private Node head;
    private Node tail;
    private int size;


    public static void main(String[] args) {

    }

    class Node{
        private int val;
        private Node next;

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}


