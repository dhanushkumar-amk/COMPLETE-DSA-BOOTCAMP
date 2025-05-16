package TREES;

// leetcode 938
// https://leetcode.com/problems/range-sum-of-bst/description/

public class RangeSumOfBST {

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

    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int low, int high) {

        int sum = 0;

        if (root == null)
            return 0;

        // InOrder traversal
        // left -> root -> right

        //left tree traversal
        if (root.val > low)
            sum += rangeSumBST(root.left, low, high);

        // the current value
        if (root.val >= low && root.val <= high)
            sum += root.val;

        // right tree traversal
        if (root.val < high)
            sum += rangeSumBST(root.right, low, high);

        return sum;
    }

}
