package LINKEDLIST;

public class ReverseLL {
    public static void main(String[] args) {

        // https://leetcode.com/problems/reverse-linked-list/description/

        LL list = new LL();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        list.display();

        list.reverseInPlace();

        list.display();
    }
}

/*

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return head;
        }

        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null){
            present.next = previous;
            previous = present;
            present = next;

            if (next != null)
                next = next.next;
        }
        return previous;
    }
}

 */