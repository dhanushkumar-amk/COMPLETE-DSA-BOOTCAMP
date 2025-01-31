package TREES;

public class PathExitsInBinaryTreeFromRootToLeaf {

    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }

    public boolean findPath(TreeNode node, int[] arr){

        if (node == null)
            return arr.length == 0;

        return helper()


    }

}
