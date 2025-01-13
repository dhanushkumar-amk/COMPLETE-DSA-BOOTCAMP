package LINKEDLIST;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }


     private class Node{
         private int value;
         private  Node next;

         public Node(Node next, int val) {
             this.next = next;
             this.value = val;
         }

         public Node(int val) {
             this.value = val;
         }



     }

    public void insertFirst(int value){
        Node node = new Node(value);

        node.next = head;
        head = node;

    }
}
