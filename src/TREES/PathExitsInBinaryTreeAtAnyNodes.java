package TREES;

import java.util.*;

public class PathExitsInBinaryTreeAtAnyNodes {
    public  class Node{
        Node left;
        Node right;
        int val;

        public Node(Node left, Node right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
        }

        public Node() {
        }
    }

    int countPaths(Node node, int sum){
        List<Integer> path = new LinkedList<>();
        return helper(node, sum, path);
    }

    private int helper(Node node, int sum, List<Integer> path) {
        if (node == null)
            return 0;

        path.add(node.val);

        int count = 0;
        int s = 0;

         ListIterator<Integer> iterator = path.listIterator(path.size());

         while (iterator.hasPrevious()){
             s += iterator.previous();

             if (s == sum)
                 count++;
         }

         count += helper(node.left, sum , path) + helper(node.right, sum , path);

         // backtrack
        path.remove(path.size() - 1);
         return count;
    }




}
