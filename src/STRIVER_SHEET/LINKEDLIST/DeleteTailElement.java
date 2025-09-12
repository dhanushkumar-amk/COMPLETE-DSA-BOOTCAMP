package STRIVER_SHEET.LINKEDLIST;

import static STRIVER_SHEET.LINKEDLIST.ArrayToLinkedList.arrayToLL;

public class DeleteTailElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = arrayToLL(arr);
        Node h = deleteTail(head);
        for (int i = h.data; i < arr.length; i++) {
            System.out.print(i + " ");
        }
    }

    public static Node deleteTail(Node head){
        if(head == null || head.next == null)
            return null;

        Node temp = head;

        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
        return head;
    }
}
