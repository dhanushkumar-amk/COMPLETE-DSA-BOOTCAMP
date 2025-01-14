package LINKEDLIST;

public class MergeTwoSortedList {
    public static void main(String[] args) {

        LL list1 = new LL();
        LL list2 = new LL();

        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);

        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);

        list1.display();
        list2.display();

       LL ans = LL.merge(list1, list2);
       ans.display();


    }
}
