package TREES;
// leetcode 105
// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/

import java.util.HashMap;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalUsingHashMap {
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

    static int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

       return helper(preorder, inorder, 0, preorder.length, map);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int left, int right, HashMap<Integer, Integer> map) {

        if (left > right)
            return null;

        int current = preorder[index];
        index++;

        TreeNode node = new TreeNode(current);

        // it becomes leaf node
        if (left == right)
            return node;

        node.left = helper(preorder, inorder, left, index - 1, map);
        node.left = helper(preorder, inorder, index + 1, right, map);

        return node;
    }

}
