package TREES;

import java.util.*;

// https://leetcode.com/problems/binary-tree-level-order-traversal/description/

// leetcode 102

public class BinaryTreeLevelOrderTraversal__BFS {


    // calculate height function
    public int height(TreeNode node){
        if (node == null)
            return -1;
        return node.height;
    }

    // display the function
    public void display(){
        display(this.root, "Root Node : ");
    }

    private void display(TreeNode node, String details) {

        if (node == null)
            return;

        System.out.println(details + TreeNode.val);

        display(node.left, "Left child of " + TreeNode.val + " : ");
        display(node.right, "Right child of " + TreeNode.val + " : ");
    }

    // insert function
    public void insert(int value){
        root = insert( value, root);
    }

    private TreeNode insert(int value, TreeNode node){

        // base case
        // if the value is null then create the new node then add the value on it and return that node
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }

        if (value < node.val){
            node.left = insert(value, node.left);
        }

        if (value > node.val){
            node.right = insert(value, node.right);
        }

        // the max height is left node and right node + 1 => is a new height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    // insert through array
    public void populate(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            this.insert(arr[i]);
        }
    }


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
                TreeNode currentNode = queue.poll(); // poll => removing fast element present in queue
                currentLevellist.add(currentNode.val);

                // add left element in current node
                if (currentNode.left != null){
                    queue.offer(currentNode.left);
                }

                // add right element in current node
                if (currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevellist);
        }
        return result;
    }

    public class TreeNode {
      static int val;
      TreeNode left;
      TreeNode right;
      int height;

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

class BFSMain{
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal__BFS tree = new BinaryTreeLevelOrderTraversal__BFS();

        int[] arr = {};
    }
}
