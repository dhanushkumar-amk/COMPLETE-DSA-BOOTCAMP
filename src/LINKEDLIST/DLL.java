package LINKEDLIST;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    // insert first
    public  void insertFirst(int val){
        Node node = new Node(val);

        node.next = head;
        node.prev = null;
        // it consists only one element then it check
        if (head != null)
           head.prev = node;

        head = node;
    }




    // display function
    public void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.val +  " --> " );
            node = node.next;
        }
        System.out.println("end");

    }


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
