package STRIVER_SHEET.LINKEDLIST;

import static STRIVER_SHEET.LINKEDLIST.ArrayToLinkedList.arrayToLL;

public class InsertElementOnHead {
    public static void main(String[] args) {

    }

    public static Node insertFirst(int val, Node head){
        Node temp = new Node(val, head);
        return temp;
    }


    public static Node insertLast(int val, Node head){
        if (head == null)
            return new Node(val);

        Node temp = head;

        while (temp.next != null){
            temp  = temp.next;
        }

        Node newNode = new Node(val);
        return newNode;
    }

}

