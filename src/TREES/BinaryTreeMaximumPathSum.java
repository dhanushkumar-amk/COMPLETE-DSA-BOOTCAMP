package TREES;

// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// leetcode 124

public class BinaryTreeMaximumPathSum {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

  int answer = Integer.MIN_VALUE;
  public int maxPathSum(TreeNode root) {
      helper(root);
      return answer;
    }

    private int helper(TreeNode node) {
      if (node == null)
          return 0;

      int left = helper(node.left);
      int right = helper(node.right);


      // if it value was negative
      left = Math.max(0, left);
      right = Math.max(0, right);

      int sum = left + right + node.val;

      answer = Math.max(answer, sum);

      return Math.max(left, right) + node.val;

    }
}
