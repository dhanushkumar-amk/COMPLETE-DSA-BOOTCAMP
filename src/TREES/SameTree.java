package TREES;

//leetcode 100

public class SameTree {
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


    public boolean isSameTree(TreeNode first, TreeNode second) {
        if (first == null && second == null)
            return true;

        if (first == null || second == null || first.val != second.val)
            return false;

        return isSameTree(first.left, second.left) && isSameTree(first.right,second.right);
    }
}
