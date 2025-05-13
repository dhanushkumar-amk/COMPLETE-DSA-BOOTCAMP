package LINKEDLIST;

public class RemoveLinkedListElement {
    
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode removeElements(ListNode head, int val) {
         // create a dummy node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode currentNode = dummy;
        while (currentNode.next != null){
            if (currentNode.next.val == val)
                currentNode.next = currentNode.next.next;
            else
                currentNode = currentNode.next;
        }
        return dummy.next;

    }

}
