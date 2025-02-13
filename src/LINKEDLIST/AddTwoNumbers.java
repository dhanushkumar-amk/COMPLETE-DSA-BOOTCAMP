package LINKEDLIST;

// https://leetcode.com/problems/add-two-numbers/description/
//leetcode 2

public class AddTwoNumbers {

    public class ListNode {
      int val;
      ListNode next;

      ListNode() {

      }

      ListNode(int val) {
          this.val = val;
      }

      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode pointer = result;

        int carry = 0;

        // if any one become null th loops ends
        while (l1 != null || l2 != null){

            int sum = 0 + carry; // init the sum

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            // get carry is exits
            carry = sum / 10;
            sum = sum % 10; // get last node as sum and create the node and init it
            pointer.next = new ListNode(sum);
            pointer = pointer.next;
        }

        if (carry == 1)
            pointer.next = new ListNode(1);

        return result.next;
    }
}
