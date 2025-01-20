package TREES;

import java.util.*;

public class BinaryTreeLevelOrderTraversal__BFS {


    public static List<List<Integer>> levelOrder(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

        }


    }

    public class TreeNode{
        private int value;
        private int height;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private TreeNode root;



}
