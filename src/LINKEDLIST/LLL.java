package LINKEDLIST;

public class LLL {

    private ListNode head;
    private  ListNode tail;
    private int size;

    public LLL() {
        this.size = 0;
    }


    public ListNode middleList(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast)

        return slow;
    }

    // reverseList in place
    public ListNode revereList(ListNode head){

        if (head == null) return head;

        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;


        while (present != null){

            present.next = next;
            previous = present;
            present = next;
            if (next != null)
                next = next.next;
        }

        // now head = previous
        return previous;
    }



    private class ListNode{

        private int val;
        private ListNode next;

        public ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }
}
