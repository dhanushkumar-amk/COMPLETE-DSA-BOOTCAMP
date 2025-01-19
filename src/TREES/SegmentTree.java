package TREES;

public class SegmentTree {


    private static class Node{
        int data;
        int startIndex;
        int endIndex;
        Node left;
        Node right;

        public Node(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }


    Node root;

    public SegmentTree(int[] arr) {
        // create a tree using array
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {

        if (start == end){
            // leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        // create new node with index you are at
        Node node = new Node(start, end);
        int mid = (start + end)/2;

        // left and right tree
        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);

        // node answer left value + right value
        node.data = node.left.data + node.right.data;
        return node;

    }

    // display function
    public void display(){
        display(this.root);
    }
    private void display(Node node) {
         String str = "";

         if (node.left != null){
             str = str + " Interval = [ " + node.left.startIndex + " - " + node.left.endIndex + " ] and the " +
                     "data : " + node.left.data  + "+ -> ";
         }
         else {
             str = str + "no left child";
         }

         //no current child
        str = str + " Interval = [ " + node.left.startIndex + " - " + node.left.endIndex + " ] and the " +
                "data : " + node.left.data  + "+ -> ";

        if (node.right != null){
            str = str + " Interval = [ " + node.right.startIndex + " - " + node.right.endIndex + " ] and the " +
                    "data : " + node.right.data  + "+ -> ";
        }
        else {
            str = str + "no right child";
        }
        System.out.println(str);


    }


    // main function
    public static void main(String[] args) {
        int[] arr = {3,8,7,6,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
    }

}
