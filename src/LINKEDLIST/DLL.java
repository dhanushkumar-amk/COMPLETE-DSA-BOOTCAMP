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
        Node temp = head;
        Node last = null;

        while (temp != null){
            System.out.print(temp.val +  " --> " );
            last = temp; // at the ned this points the last node
            temp = temp.next;

        }
        System.out.println("end");

        System.out.println("Print in reverse : ");
        while (last != null){
            System.out.print(last.val + " --> ");
            last = last.prev;
        }
        System.out.println();
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
