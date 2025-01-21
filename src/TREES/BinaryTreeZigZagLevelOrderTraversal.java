package TREES;

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
// leetcode 103

import java.util.*;

public class BinaryTreeZigZagLevelOrderTraversal {

    public class TreeNode {
        int val;
          TreeNode left;
          TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val,   TreeNode left,   TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private TreeNode root;

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);

        boolean isReverse = false;

        while(!deque.isEmpty()){
            int currentLevelSize = deque.size();
            List<Integer> currentLevelList = new ArrayList<>(currentLevelSize);

            for (int i = 0; i < currentLevelSize; i++) {

                if (!isReverse){
                    TreeNode currentNode = deque.pollFirst();
                    currentLevelList.add(currentNode.val);

                    if (currentNode.left != null)
                        deque.addLast(currentNode.left);

                    if (currentNode.right != null)
                        deque.addLast(currentNode.right);
                }else{

                    TreeNode currentNode = deque.pollLast();
                    currentLevelList.add(currentNode.val);

                    if (currentNode.right != null)
                        deque.addFirst(currentNode.right);

                    if (currentNode.left != null)
                        deque.addFirst(currentNode.left);

                }

            }
            // if true means false || false means true conversion on every iteration
            isReverse = !isReverse;

            result.add(currentLevelList);
        }
        return result;
    }


}
