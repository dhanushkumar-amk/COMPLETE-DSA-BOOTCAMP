package TREES;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
// leetcode 104

public class MaximumDepthOfBinaryTree {

    public class TreeNode{

        int val;
         TreeNode left;
         TreeNode right;

        public TreeNode( TreeNode left,  TreeNode right, int val) {
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

    private  TreeNode root;


    public int maxDepth(TreeNode root) {

        if(root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int depth = Math.max(left, right);

        return depth + 1;
    }

}
