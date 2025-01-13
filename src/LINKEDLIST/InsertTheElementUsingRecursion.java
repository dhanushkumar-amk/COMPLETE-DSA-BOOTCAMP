package LINKEDLIST;


public class InsertTheElementUsingRecursion {

    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);

        list.display();

        list.insertRecursion(100, 4);
        list.display();
    }
}