package TREES;

// https://leetcode.com/problems/invert-binary-tree/
// leetcode 226

public class InvertBinaryTree {

    public class TreeNode{

         int val;
       TreeNode left;
        TreeNode right;

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private TreeNode root;


    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null ;

        TreeNode leftNode = invertTree(root.left);
        TreeNode rightNode = invertTree(root.right);

        root.left = rightNode;
        root.right = leftNode;

        return root;
    }
}
