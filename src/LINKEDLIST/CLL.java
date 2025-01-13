package LINKEDLIST;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }


    // insert
    public void insert(int val){
        Node node = new Node(val);

        tail.next = node;
        node.next = head;
        tail = node;

        if (head == null){
            head = node;
            tail = node;
            return;
        }
    }

    // display
    public void display(){
        Node temp = head;

        do{
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }while (temp != head);

        System.out.println("end");
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