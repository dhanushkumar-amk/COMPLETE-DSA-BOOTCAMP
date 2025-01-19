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
        str = str + " Interval = [ " + node.startIndex + " - " + node.endIndex + " ] and the " +
                "data : " + node.data  + "+ -> ";

        if (node.right != null){
            str = str + " Interval = [ " + node.right.startIndex + " - " + node.right.endIndex + " ] and the " +
                    "data : " + node.right.data ;
        }
        else {
            str = str + "no right child";
        }
        System.out.println(str + "\n");

        if(node.left != null)
            display(node.left);

        if(node.right != null)
            display(node.right);
    }


    // query
    public int query(int queryStartIndex, int queryEndIndex){
        return this.query(this.root, queryStartIndex, queryEndIndex);
    }

    private int query(Node node, int queryStartIndex, int queryEndIndex) {
        if (node.startIndex >= queryStartIndex && node.endIndex <= queryEndIndex){
            // node completely lie inside the query
            return node.data;
        } else if (node.startIndex > queryEndIndex || node.endIndex < queryStartIndex) {
            // completely outside
            return 0;
        }else{
            return this.query(node.left, queryStartIndex, queryEndIndex) + this.query(node.right, queryStartIndex, queryEndIndex);
        }
    }

    // update value in particular index

    public void update(int index, int value){
        this.root.data = update(index, value, this.root);
    }

    private int update(int index, int value, Node node){
        if (index >= node.startIndex && index <= node.endIndex){
            if (index == node.startIndex  && index == node.endIndex){
             // base case
             node.data = value;
             return node.data;
            }else{
                int leftAnswer = update( index, value, node.left);
                int rightAnswer = update( index, value, node.right);

                node.data = leftAnswer + rightAnswer;
                return node.data;
            }
        }
        return node.data;
    }
}


class segmentMain{
    public static void main(String[] args) {
        int[] arr = {3,8,7,6,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);


        System.out.println(tree.query(2,6));
        //tree.update(0, 1);
        tree.display();
    }
}
