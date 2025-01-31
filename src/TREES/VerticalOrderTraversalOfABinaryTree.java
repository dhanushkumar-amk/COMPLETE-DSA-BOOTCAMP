package TREES;

// leetcode 987
// https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/description/

import java.util.*;

public class VerticalOrderTraversalOfABinaryTree {

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

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();

        if (root == null)
            return answer;

        int column = 0;
        Queue<Map.Entry<TreeNode, Integer>> queue = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        queue.offer(new AbstractMap.SimpleEntry<>(root, column));

        int min = 0;
        int max = 0;

        while (!queue.isEmpty()){
            Map.Entry<TreeNode, Integer> removed = queue.poll();
            root = removed.getKey();
            column = removed.getValue();


            if (root != null){
                if (!map.containsKey(column)){
                    map.put(column, new ArrayList<Integer>());
                }
                map.get(column).add(root.val);

                min = Math.min(min, column);
                max = Math.max(max, column);

                queue.offer(new AbstractMap.SimpleEntry<>(root.left, column- 1));
                queue.offer(new AbstractMap.SimpleEntry<>(root.right, column + 1));

            }
        }

        for (int i = min; i <= max; i++) {
            answer.add(map.get(i));
        }

        return answer;
    }
}
