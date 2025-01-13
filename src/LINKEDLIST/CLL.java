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


        if (head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;

    }

    // delete
    public void delete(int val){
        Node temp = head;

        if (temp == null){
            return;
        }

        if (temp.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = temp.next;
            if (n.val == val){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while (temp != head);

    }

    // display
    public void display(){
        Node temp = head;

        if (head != null) {
            do {
                System.out.print(temp.val + " --> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("head");
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