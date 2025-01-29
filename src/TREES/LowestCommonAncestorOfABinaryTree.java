package TREES;


// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// leetcode 236

public class LowestCommonAncestorOfABinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

      if(root == null)
        return null;

      //found one these node
      if (root == p || root == q)
        return root;

      TreeNode left = lowestCommonAncestor(root.left, p, q);
      TreeNode right = lowestCommonAncestor(root.right, p, q);

      if (left != null && right != null )
        return root;

      return left == null ? right : left;
  }

}
