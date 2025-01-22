package TREES;

public class CousinsInBinaryTree {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private TreeNode  root;

    public boolean isCousins(TreeNode root, int x, int y) {

        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
                (level(root, xx, 0) == level(root, yy, 0)) && (isSibling(root, xx, yy))

        );
    }

    private boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {

        if (node == null)
            return false;

        return (
               (node.left == x  &&  node.right == y) || (node.left == y && node.right == x) || isSibling(node.left, x, y)
                        || isSibling(node.right, x ,y)
                );
    }

    private int level(TreeNode node, TreeNode x, int lev) {

        if (node == null)
            return 0;

        if (node == x)
            return lev;

        int left  = level(node.left, x, lev+ 1);

        if (left != 0)
            return left;
        else
            return level(node.right, x, lev + 1);

    }

    private TreeNode findNode(TreeNode node, int x) {

        if (node == null)
            return null;

        if (node.val == x)
            return node;

        // find left hand side
        TreeNode n = findNode(node.left, x);
        if (n != null)
            return n;

        // otherwise find right side
        return findNode(node.right, x);
    }





}
