package TRIE;

import java.util.LinkedList;
import java.util.Queue;

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

  private TreeNode root1;
  private TreeNode root2;


    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root1);
        queue.offer(root2);

        while (!queue.isEmpty()){
            TreeNode first = queue.poll();
            TreeNode second = queue.poll();

            if (first == null && second == null)
                continue;
            else if (first == null || second == null || first.val != second.val)
                return false;

            queue.add(root1.left);
            queue.add(root2.left);
            queue.add(root1.right);
            queue.add(root2.right);
        }
        return true;
    }
}
