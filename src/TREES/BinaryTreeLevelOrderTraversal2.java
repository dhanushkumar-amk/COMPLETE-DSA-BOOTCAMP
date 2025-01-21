package TREES;

import java.util.*;

// https://leetcode.com/problems/binary-tree-level-order-traversal-ii
// leetcode 107

public class BinaryTreeLevelOrderTraversal2 {



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


    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){

            int currentLevelSize = queue.size();

            List<Integer> currentLevelList = new ArrayList<>(currentLevelSize);

            for (int i = 0; i < currentLevelSize ; i++) {

                TreeNode currentNode = queue.poll();
                currentLevelList.add(currentNode.val);

                if (currentNode.left != null)
                    queue.offer(currentNode.left);

                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }

            result.add(0, currentLevelList);
        }
        return result;
    }
}
