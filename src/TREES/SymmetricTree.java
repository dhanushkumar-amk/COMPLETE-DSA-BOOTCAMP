package TREES;


// https://leetcode.com/problems/symmetric-tree/description/

// leetcode 101


import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {


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

  private TreeNode root;

    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode>  queue = new LinkedList<>();
        queue.offer(root);

        

    }

    

}
