package TREES;

import java.util.*;

public class BinaryTreeLevelOrderTraversal__BFS {


    public static List<List<Integer>> levelOrder(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevellist = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize ; i++) {
                TreeNode currentNode = queue.poll(); // poll => removing
                currentLevellist.add(currentNode.val);

                if (currentNode.left != null){
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevellist);
        }
        return result;
    }

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



}
