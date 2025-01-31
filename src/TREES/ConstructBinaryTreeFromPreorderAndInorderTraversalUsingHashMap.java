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


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        int[] index = {0};

       return helper(preorder, inorder, 0, preorder.length, map, index);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int left, int right, HashMap<Integer, Integer> map, int[] index) {

        if (left > right)
            return null;

        int current = preorder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(current);

        // it becomes leaf node
        if (left == right)
            return node;

        int inOrderIndex = map.get(current);

        node.left = helper(preorder, inorder, left, inOrderIndex - 1, map,index);
        node.left = helper(preorder, inorder, inOrderIndex + 1, right, map, index);

        return node;
    }

}
