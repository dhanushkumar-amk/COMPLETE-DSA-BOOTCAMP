package TREES;

public class ConvertBinaryTreeToDoublyLinkedList {
    LLNode head;
    LLNode tail;

    public TreeNode convert(TreeNode root){
        if (root == null)
            return null;

        helper(root);

        return root;
    }

    private void helper(TreeNode node) {
        if (node == null)
            return;

        helper(node.left);

        LLNode newNode = new LLNode(node.val);

        if (head == null){
            head
        }


        helper(node.right);
    }


}

class LLNode{
    int val;
    LLNode prev;
    LLNode next;

    public LLNode(int val) {
        this.val = val;
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode() {
    }

    public TreeNode(TreeNode left, TreeNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public TreeNode(int val) {
        this.val = val;
    }
}
