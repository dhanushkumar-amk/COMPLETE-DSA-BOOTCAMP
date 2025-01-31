package TREES;

import java.util.Stack;

public class DFSUsingStack {
    class Node{
        Node left;
        Node right;
        int val;

        public Node() {
        }

        public Node(int vsl) {
            this.val = vsl;
        }

        public Node(Node left, Node right, int vsl) {
            this.left = left;
            this.right = right;
            this.val = vsl;
        }
    }

    void stackDFS(Node root){

        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node removed = stack.pop();
            System.out.println(removed.val);

            // preorder traversal root => left => right
            if (removed.right != null){
                stack.push(removed.right);
            }

            if (removed.left != null)
                stack.push(removed.left);
        }
    }
}
