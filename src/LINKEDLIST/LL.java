package LINKEDLIST;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

     // insert element in first
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null)
            tail  = head;

        size += 1;
    }

    // insert element in last
    public void insertLast(int val){
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    // insert element in particular index
    public void insert(int val, int index){
        if (index == 0){
            insertLast(val);
            return;
        }

        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // delete first
    public void deleteFirst(){
        head = head.next;
        if (head == null)
            tail = null;
        size--;
    }

    //delete last
    public void deleteLast(){
        if (size <= 1){
            deleteFirst();
            return;
        }

        Node secondLast = getRef(size - 2);
        tail = secondLast;
        tail.next = null;

    }

    // delete the element in particular index
    public void deleteIndex(int index){

        if (index == 0){
            deleteFirst();
            return;
        }

        if (index == size - 1){
            deleteLast();
            return;
        }

        Node previousIndex = getRef(index - 1);
        previousIndex.next = previousIndex.next.next;
    }


    // display function
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +  " --> " );
            temp = temp.next;
        }
        System.out.println("end");
    }

    // get the reference type of the node in the given index
    public Node getRef(int index){
        Node node = head;

        for (int i = 0; i <index ; i++) {
            node = node.next;
        }

        return node;
    }

    // get the node of the particular val
    public Node getNode(int val){

        Node node = head;

        while (node != null){
            if (node.val == val)
                return node;

            node = node.next;
        }
        return null;
    }


    // important class constructor
    private class Node{
        private int val;
        private  Node next;

        public Node( int val,Node next) {
            this.next = next;
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
        }
    }


    // questions

    // insert element using recursion
    public  void insertRecursion(int val, int index){
        head = insertRecursion(val, index, head);
    }

    private Node insertRecursion(int val, int index, Node node){

        if (val == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertRecursion(val, index-=1, node.next);
        return node;
    }


    // remove all duplicates from sorted list
    public void removeDuplicates(){
        Node node = head;
        while (node.next != null){
            if (node.val == node.next.val){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        node = tail;
        tail.next = null;
    }


    // mergeTwo Sorted list
    public static LL merge(LL first, LL second){

        Node firstListHead = first.head;
        Node secondListHead = second.head;

        LL ans = new LL();

        while (firstListHead != null && secondListHead != null){
            if (firstListHead.val < secondListHead.val){
                ans.insertLast(firstListHead.val);
                firstListHead = firstListHead.next;
            }else{
                ans.insertLast(secondListHead.val);
                secondListHead = secondListHead.next;
            }
        }


        while (firstListHead != null){
            ans.insertLast(firstListHead.val);
            firstListHead = firstListHead.next;
        }

        while (secondListHead != null){
            ans.insertLast(secondListHead.val);
            secondListHead = secondListHead.next;
        }
        return ans;
    }


    // Detect linkedList cycle
    public boolean hasCycle(Node head){

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            if (fast == slow){
                return true;
            }
            slow = slow.next;
            fast= fast.next.next;
        }
        return false;
    }


    // find the length of linked list cycle
    public int LengthOfTheCycle(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;

            if (fast == slow){
                Node temp = slow;  // because it initially on the slow so we use do while loop
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while (temp != slow);

                return length;
            }
        }
        return 0; // if cycle is not present
    }


    // give the cycle where is started
    public Node detectedCycleStartPlace(Node head){
        int length = 0;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            if (fast == slow){
                length = LengthOfTheCycle(slow);
                break;
            }
            slow = slow.next;
            fast= fast.next.next;
        }

        if (length == 0)
            return null;

        // find the start node
        Node first =head;
        Node second =head;

        while (length > 0){
            second = second.next;
            length--;
        }

        // keep moving both forward they can meet start position
        while (first != second){
            first = first.next;
            second = second.next;
        }

        return first;  // or slow your wish
    }


    // middle of the linked list
    public static Node middleOfTheLinkedList(Node head ){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // sort the list using merge sort
    public Node sortList(Node head){

        // if there is only element o zero element
        if (head == null || head.next == null)
            return head;

        Node middle = middleOfTheLinkedList(head);
        Node left = sortList(head);
        Node right = sortList(middle);

       // return merge(left, right);
        return head;
    }

    // bubble sort
    public void bubbleSort(){
        bubbleSort(size - 1, 0);
    }
    private void bubbleSort(int row, int column) {

        // base case
        if (row == 0)
            return;

        if (column < row){
            Node first = getNode(column);
            Node second = getNode(column + 1);

            if (first.val > second.val){

                // swap
                if (first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node previous = getNode(column - 1);
                    previous.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else{
                    Node previous = getNode(column - 1);
                    previous.next = second;
                    first.next = second.next;
                    second.next = first;
                }

            }
            bubbleSort(row , column + 1);
        }
        else{
            bubbleSort(row-1, 0);
        }
    }

    // reverse a list using recursion
    public void reverseRecursion(Node node){

        // base case
        if (node == tail){
            head = tail;
            return;
        }

        // calling next next until reach last
        reverseRecursion(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }


    // inPlace reversal of the LL using iterative method
    public void reverseInPlace(){

        if (size < 2)
            return;

        Node previous = null;
        Node present = head;
        Node next = present.next;

        while (present != null){
            present.next = previous;
            previous = present;
            present = next;

            if (next != null)
                next = next.next;
        }
        head = previous;
    }

    // reverse a linkedList in an given range
    public void reverseBetween(int left, int right){

        // left == right means there is only one element
        if (left == right)
            return;
        // return head;

        // skip first left - 1 nodes
        Node present = head;
        Node previous = null;
        Node next = present.next;

        for (int i = 0; present != null && i < left - 1; i++) {
            previous = present;
            present = present.next;
        }
        Node last = previous;
        Node newEnd = present;

        // reverse between left and right
        for (int i = 0; present != null && i < right - left + 1; i++) {
            present.next = previous;
            previous = present;
            present = next;

            if (next != null)
                next = next.next;
        }

        if (last != null)
            last.next = previous;
        else
            head = previous;

        newEnd.next = present;

        // return head;

    }


    // palindromic linked list
    

}

