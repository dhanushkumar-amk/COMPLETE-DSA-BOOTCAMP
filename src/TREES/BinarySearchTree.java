package TREES;

public class BinarySearchTree {



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

    public BinarySearchTree() {
    }

    // calculate height function
    public int height(Node node){
        if (node == null)
            return -1;
        return node.height;
    }

    // is empty function
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

    // insert function
    public void insert(int value){

    }

    private Node insert(int value, Node node){

        // base case
        // if the value is null then the given value act as a root element
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value){
        node.left = insert(value, node.left);
        }

        if (value > node.value){
            node.right = insert(value, node.right);
        }

        
    }


}
