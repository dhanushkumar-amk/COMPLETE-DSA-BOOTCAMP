package TREES;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        int[] arr = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(arr);
        tree.display();
    }
}
