package LINKEDLIST;

public class IntersectionOfTwoLinkedLists {


    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLitLength(headA);
        int lengthB = getLitLength(headB);

        while (lengthA > lengthB){
            lengthA--;
            headA = headA.next;
        }

        while(lengthB > lengthA){
            lengthB--;
            headB = headB.next;
        }

        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int getLitLength(ListNode head){
        int length = 0;
        while(head.next != null){
            length++;
            head = head.next;
        }
        return length;
    }
    
}
