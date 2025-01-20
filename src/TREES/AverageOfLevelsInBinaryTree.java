package TREES;


// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

// leetcode 637


import java.util.*;

public class AverageOfLevelsInBinaryTree {


    public List<Double> averageOfLevels(TreeNode root) {
            List<Double> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            double averageOfCurrentLevel = 0;
            int currentLevelSize = queue.size();

            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode currentNode = queue.poll();

                averageOfCurrentLevel += currentNode.val;

                if (currentNode.left != null)
                    queue.offer(currentNode.left);

                if (currentNode.right != null)
                    queue.offer(currentNode.right);

            }

            averageOfCurrentLevel = averageOfCurrentLevel / currentLevelSize;
            result.add(averageOfCurrentLevel);
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
