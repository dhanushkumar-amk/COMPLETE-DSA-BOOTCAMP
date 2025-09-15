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
         print(head);
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


//  Print the linked list
     public static void print(NodeDLL head){
         while (head != null){
             System.out.print(head.data + " ");
             head = head.next;
         }
     }

     


 }






