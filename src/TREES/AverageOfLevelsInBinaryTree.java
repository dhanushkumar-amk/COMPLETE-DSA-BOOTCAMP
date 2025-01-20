package TREES;


// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

// leetcode 637

public class AverageOfLevelsInBinaryTree {


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
}
