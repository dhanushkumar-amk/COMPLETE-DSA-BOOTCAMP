package STRIVER_SHEET.LINKEDLIST;

public class NodeIntro {

    public static void main(String[] args) {

        Node node = new Node(25, null);
        System.out.println(node.data);

    }
}



class Node{

    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


