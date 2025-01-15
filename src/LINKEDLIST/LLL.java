package LINKEDLIST;

public class LLL {

    private ListNode head;
    private  ListNode tail;
    private int size;

    public LLL() {
        this.size = 0;
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
