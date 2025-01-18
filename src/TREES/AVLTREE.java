package TREES;

public class AVLTREE {
    private Node left;

    public class Node{
        private int value;
        private int height;
        private  Node left;
        private  Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private  Node root;

    public AVLTREE() {
    }

    // calculate height function
    public int height( Node node){
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
        display(this.root, "Root Node : ");
    }

    private void display( Node node, String details) {

        if (node == null)
            return;

        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    // insert function
    public void insert(int value){
        root = insert( value, root);
    }

    private  Node insert(int value,  Node node){

        // base case
        // if the value is null then create the new node then add the value on it and return that node
        if (node == null) {
            node = new  Node(value);
            return node;
        }

        if (value < node.value){
            node.left = insert(value, node.left);
        }

        if (value > node.value){
            node.right = insert(value, node.right);
        }

        // the max height is left node and right node + 1 => is a new height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // after insertion of the node then it check and it unbalanced then it will rotated and return as a root node
        return rotate(node);
    }

    // rotate function
    private Node rotate(Node node) {

        if (height(node.left)  - height(node.right) > 1){
            //left heavy
            if (height(node.left.left) - height(node.left.right) > 0){
                // left left case => right rotate  node
                return rightRotate(node);
            }

            if (height(node.left.left) - height(node.left.right) < 0){
                // left right case => left rotate on child and do right rotate on  node
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.left)  - height(node.right) < -1){
            //right  heavy
            if (height(node.right.left) - height(node.right.right) < 0){
                // right right case => right rotate  node
                return leftRotate(node);
            }

            if (height(node.right.left) - height(node.right.right) > 0){
                // left right case => left rotate on child and do right rotate on  node
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;

    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;


        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }

    // insert through array
    public void populate(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            this.insert(arr[i]);
        }
    }

    // insert the element in sorted array
    public void populateSorted(int[] arr){
        populateSorted(arr, 0, arr.length);
    }

    private void populateSorted(int[] arr, int start, int end) {

        // base case
        if (start >= end)
            return;

        int mid = (start + end)/2;
        this.insert(arr[mid]);

        populateSorted(arr, start, mid);
        populateSorted(arr, mid+1, end);
    }


    // isBalanced or not
    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced( Node node) {
        if (node == null)
            return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }
}

class AVLMain{
    public static void main(String[] args) {
        AVLTREE tree = new AVLTREE();

        for (int i = 0; i <1000 ; i++) {
            tree.insert(i);
        }

//        tree.populate(arr);
//        tree.populateSorted(arr);
        tree.display();
        System.out.println(tree.isEmpty());
        System.out.println(tree.isBalanced());
    }
}