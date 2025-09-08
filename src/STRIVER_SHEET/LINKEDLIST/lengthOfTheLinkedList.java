package STRIVER_SHEET.LINKEDLIST;

import static STRIVER_SHEET.LINKEDLIST.ArrayToLinkedList.arrayToLL;

public class lengthOfTheLinkedList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(lengthOfLL(arr));
    }

    public static int lengthOfLL(int[] arr){

        Node head = arrayToLL(arr);
        Node temp = head;

        int count = 0;

        while (temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }
}
