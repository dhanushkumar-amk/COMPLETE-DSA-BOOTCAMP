package TREES;

public class BinarySearchTree {

    public BinarySearchTree() {
    }

    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public int height(Node node){
        if (node == null)
            return -1;
        return node.height;
    }

    // root is null means there is empty
    public boolean isEmpty(){
        return root == null;
    }


    // display the function
    public void display(){
        display(root, "Root Node : ");
    }

    private void display(Node node, String details) {

        if (node == null)
            return;

        System.out.println(details + node.getValue());

        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    


}
