package TREES;

//leetcode 653
// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/

import java.util.HashSet;

public class TwoSumIvInputIsABST {

    class TreeNode{
       TreeNode left;
       TreeNode right;
       int val;

        public TreeNode() {
        }

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean findTarget(TreeNode root, int k) {

        HashSet<Integer> set = new HashSet<>();
        return helper(root, k, set);

    }

    private boolean helper(TreeNode node, int k, HashSet<Integer> set) {
        if (node == null)
            return false;

        if (set.contains(k - node.val))
            return true;

        set.add(node.val);

        return helper(node.left, k, set) || helper(node.right, k, set);
    }

}
