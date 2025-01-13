package LINKEDLIST;

public class InsertTheElementUsingRecursion {

    private Node head;
    private Node tail;
    private int size;


    public static void main(String[] args) {

        InsertTheElementUsingRecursion list = new InsertTheElementUsingRecursion();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);

        list.display();

        list.insertRecursion(200, 2);

        list.display();

    }

    public  void insertRecursion(int val, int index){
        head = insertRecursion(val, index, head);
    }

    private  Node insertRecursion(int val, int index, Node node){

        if (val == 0){
            Node temp = new Node(node,val);
            size++;
            return temp;
        }

        node.next = insertRecursion(val, index--, node.next);
        return node;
    }


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null)
            tail  = head;

        size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +  " --> " );
            temp = temp.next;
        }
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


