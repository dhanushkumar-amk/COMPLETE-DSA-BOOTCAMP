package TREES;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
// leetcode 108;

public class ConvertSortedArrayToBinarySearchTree {

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

    public TreeNode sortedArrayToBST(int[] arr) {
            return helper(arr, 0, arr.length - 1);
    }

    private TreeNode helper(int[] arr, int left, int right) {

        if (left > right)
            return null;

        int mid = (left + right)/2;
        TreeNode root = new TreeNode(arr[mid]);

        root.left = helper(arr, 0, mid - 1);
        root.right = helper(arr, mid + 1, right);

        return root;
    }

}
