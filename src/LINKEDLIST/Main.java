package LINKEDLIST;

public class Main {
    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(5);

        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);

        list.insert(100, 3);

        list.display();
    }
}
