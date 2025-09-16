package STRIVER_SHEET.LINKEDLIST;

 class NodeDLL {

    int data;
     NodeDLL prev;
     NodeDLL next;

     public NodeDLL(int data, NodeDLL prev, NodeDLL next) {
         this.data = data;
         this.prev = prev;
         this.next = next;
     }

     public NodeDLL(int data) {
         this.data = data;
         this.prev = null;
         this.next = null;
     }
 }

 public class Main{
     public static void main(String[] args) {
         int[] arr  = {1,2,3,4,5};
         NodeDLL head = convertArrayToDLL(arr);
        NodeDLL head1 = deleteKthElement(head, 2);
        print(head1);
     }

    // Convert Array to Double Linked List
     public static NodeDLL convertArrayToDLL(int[] arr){
        NodeDLL head = new NodeDLL(arr[0]);
        NodeDLL prev = head;

         for (int i = 1; i < arr.length; i++) {
             NodeDLL temp = new NodeDLL(arr[i], prev, null);
             prev.next = temp;
             prev = temp;
         }
         return head;
     }


     // Delete the Head
     public static NodeDLL deleteHead(NodeDLL head){
         if (head == null && head.next == null)
             return null;

         NodeDLL tempPrev  = head;
         head = head.next;
         head.prev = null;
         tempPrev.next = null;

         return head;
     }

     // Delete the Tail
     public static NodeDLL deleteTail(NodeDLL head){
         if (head == null && head.next == null)
             return null;

         NodeDLL tail = head;
         while (tail.next != null){
             tail = tail.next;
         }

         NodeDLL previousTail = tail.prev;
         previousTail.next = null;
         tail.prev = null;

         return head;
     }

     public static NodeDLL deleteKthElement(NodeDLL head, int k){

         if (head == null)
             return null;

         int count = 0;
         NodeDLL temp = head;
         while (temp.next != null){
             count++;
             if (count == k)
                 break;
             temp = temp.next;
         }

         NodeDLL previousElement = temp.prev;
         NodeDLL nextElement = temp.next;

         if (previousElement == null && nextElement == null)
             return null;
         else if(previousElement == null)
             return deleteHead(head);
         else if(nextElement == null)
             return deleteTail(head);

         previousElement.next = nextElement;
         nextElement.prev = previousElement;

         temp.next = null;
         temp.prev = null;

         return head;
     }


    // Print the linked list
     public static void print(NodeDLL head){
         while (head != null){
             System.out.print(head.data + " ");
             head = head.next;
         }
     }

     


 }






