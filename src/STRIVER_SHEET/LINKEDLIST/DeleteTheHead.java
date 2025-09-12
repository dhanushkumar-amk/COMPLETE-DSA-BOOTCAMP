package STRIVER_SHEET.LINKEDLIST;

import java.util.Arrays;

import static STRIVER_SHEET.LINKEDLIST.ArrayToLinkedList.arrayToLL;
import static STRIVER_SHEET.LINKEDLIST.IterateLinkedList.iterate;

public class DeleteTheHead {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = arrayToLL(arr);
        Node h = deleteNode(head);

        for (int i = h.data; i <= arr.length; i++) {
            System.out.print(i + " ");
        }
    }

    public static Node deleteNode(Node head){

        if (head == null)
            return head;
        head = head.next;
        return head;
    }
}
