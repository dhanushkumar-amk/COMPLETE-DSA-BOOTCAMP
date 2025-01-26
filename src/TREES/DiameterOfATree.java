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

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {


        height(root);

        return diameter - 1;
    }


    private int height(TreeNode node) {

        if (node == null)
            return 0;

        int heightOfLeftNode = height(node.left);
        int heightOfRightNode = height(node.right);

        int dia = heightOfLeftNode + heightOfRightNode + 1;
        diameter = Math.max(diameter, dia);

        return Math.max(heightOfLeftNode, heightOfRightNode) + 1;
    }



}
