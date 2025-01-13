package LINKEDLIST;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }


     // insert element in first
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null)
            tail  = head;

        size += 1;
    }

    // insert element in last
    public void insertLast(int val){
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    // display function
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +  " --> " );
            temp = temp.next;
        }
        System.out.println("end");
    }


    // insert element in particular index
    public void insert(int val, int index){
        if (index == 0){
            insertLast(val);
            return;
        }

        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        size++;
    }


    private class Node{
        private int val;
        private  Node next;

        public Node( int val,Node next) {
            this.next = next;
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
