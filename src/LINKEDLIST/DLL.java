package LINKEDLIST;

public class DLL {

    private Node head;
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

    // insert last
    public void insertLast(int val){
        Node node =new Node(val);

        Node last = head;
        node.next = null;

        if (head == null){
            node.next = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        node.next = null;
    }

    // insert index
    public void insert(int after, int val){
        Node previous = getNode(after);

        if (previous == null){
            System.out.println("does not exit");
            return;
        }

        Node node = new Node(val);

        node.next = previous.next;
        previous.next = node;
        node.prev = previous;

        if (node.next != null)
            node.next.prev = node;

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
        System.out.println("start");
    }

    // get the node;
    public Node getNode(int val){

        Node node = head;

        while (node != null){
            if (node.val == val)
                return node;

            node = node.next;
        }
        return null;
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
