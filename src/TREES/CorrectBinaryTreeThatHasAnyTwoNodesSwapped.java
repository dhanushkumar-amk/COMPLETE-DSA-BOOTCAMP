package TREES;

public class CorrectBinaryTreeThatHasAnyTwoNodesSwapped {
    class Node{
        Node left;
        Node right;
        int val;

        public Node() {
        }

        public Node(Node left, Node right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    Node first;
    Node second;
    Node previous;

    public void helper(Node root){
        inOderTraversal(root);

        // swap
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return;
    }

    private void inOderTraversal(Node root) {
            if (root == null)
                return;

            inOderTraversal(root.left);

            if (previous.val > root.val && previous != null) {
                if (first == null) {
                    first = previous;
                }
                second = root;
            }
            previous = root;

            inOderTraversal(root.right);
    }
}
