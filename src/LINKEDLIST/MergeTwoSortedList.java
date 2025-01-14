package LINKEDLIST;

public class MergeTwoSortedList {
    public static void main(String[] args) {

        LL list1 = new LL();
        LL list2 = new LL();

        list1.insertFirst(1);
        list1.insertFirst(3);
        list1.insertFirst(5);

        list2.insertFirst(1);
        list2.insertFirst(2);
        list2.insertFirst(9);
        list2.insertFirst(14);

        list1.display();
        list2.display();

        System.out.println(LL.merge(list1, list2));

    }
}
