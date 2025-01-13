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

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // delete first
    public void deleteFirst(){
        head = head.next;
        if (head == null)
            tail = null;
        size--;
    }

    //delete last
    public void deleteLast(){
        if (size <= 1){
            deleteFirst();
            return;
        }

        Node secondLast = getRef(size - 2);
        tail = secondLast;
        tail.next = null;

    }

    // delete the element in particular index
    public void deleteIndex(int index){

        if (index == 0){
            deleteFirst();
            return;
        }

        if (index == size - 1){
            deleteLast();
            return;
        }

        Node previousIndex = getRef(index - 1);
        previousIndex.next = previousIndex.next.next;
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

    // get the reference type of the node in the given index
    public Node getRef(int index){
        Node node = head;

        for (int i = 0; i <index ; i++) {
            node = node.next;
        }

        return node;
    }

    // get the node of the particular val
    public int getNode(int val){

        Node node = head;

        while (node != null){
            if (node.val == val)
                return node.val;

            node = node.next;
        }
        return -1;
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
