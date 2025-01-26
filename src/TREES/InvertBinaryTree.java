package TREES;


public class InvertBinaryTree {

    class   TreeNode{

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

        return root;
    }
}
