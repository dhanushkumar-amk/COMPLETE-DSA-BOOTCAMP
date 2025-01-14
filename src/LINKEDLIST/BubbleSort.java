package LINKEDLIST;

public class BubbleSort {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(5);
        list.insertLast(8);
        list.insertLast(3);

        list.display();
        list.bubbleSort();
        list.display();
    }
}
