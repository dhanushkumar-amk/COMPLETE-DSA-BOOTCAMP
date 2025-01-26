package TREES;

// https://leetcode.com/problems/diameter-of-binary-tree/description/
// leetcode 543

public class DiameterOfATree {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;

       TreeNode() {

       }

       TreeNode(int val) {
           this.val = val;
       }

       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }

   private TreeNode root;

    public int diameterOfBinaryTree(TreeNode root) {
        int diameter = 0;

        height(root);

        return diameter;
    }

    private int height(TreeNode node) {

        if (node == null)
            return 0;

        int heightOfLeftNode = height(node.left);
        int heightOfRightNode = height(node.right);

        return Math.max(heightOfLeftNode, heightOfRightNode) + 1;
    }

}
