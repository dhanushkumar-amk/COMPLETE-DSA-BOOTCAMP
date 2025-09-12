package STRIVER_SHEET.LINKEDLIST;

public class ArrayToLinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node head = arrayToLL(arr);
        System.out.println(head.data);
    }

    public static Node arrayToLL(int[] arr){
        Node head = new Node(arr[0]);

        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}


