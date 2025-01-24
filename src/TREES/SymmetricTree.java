package TREES;


// https://leetcode.com/problems/symmetric-tree/description/

// leetcode 101


import com.sun.source.doctree.IndexTree;

import java.util.LinkedList;
import java.util.List;
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
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            // both are null skip it
            if (left == null && right == null)
                continue;

            // if one node is null then break and return false;
            if (left == null || right == null  )
                return false;

            // if the left value not equal to right value
            if (left.val != right.val)
                return false;

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);

        }

        return true;
    }

    

}
