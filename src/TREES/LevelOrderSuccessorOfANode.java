package TREES;

import java.util.*;

public class LevelOrderSuccessorOfANode {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val,  TreeNode left,  TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private TreeNode root;

public TreeNode findSuccessor(TreeNode root, int key){

    if (root == null)
        return root;


    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()){

            TreeNode currentNode = queue.poll();

            if (currentNode.left != null)
                queue.offer(currentNode.left);

            if (currentNode.right != null)
                queue.offer(currentNode.right);

            //   TreeNode currentNode = queue.poll(); if removed element is key thn next element present in queue is the successor
            if (currentNode.val == key)
                break;
        }
        return queue.peek();
    }
}



