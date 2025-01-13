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
            head = tail;

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


    private class Node{
        private int val;
        private  Node next;

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
