package TREES;

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
// leetcode 114


public class FlattenBinaryTreeToLinkedList {
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

    public void flatten(TreeNode root) {

        if (root == null)
            return;

        TreeNode currentNode = root;
        while (currentNode != null){
            if (currentNode.left != null){
                TreeNode temp = currentNode.left;

                while (temp.right != null){
                    temp = temp.right;
                }

                temp.right = currentNode.right;
                currentNode.right = currentNode.left;
                currentNode.left = null;

                currentNode = currentNode.right;
            }
        }

    }
}
