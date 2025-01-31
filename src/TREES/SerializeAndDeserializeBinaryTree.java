package TREES;

// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
// leetcode 297

import java.util.*;

public class SerializeAndDeserializeBinaryTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
        val = x;
      }

  }

  public List<String> serialize(TreeNode root) {
    List<String> list = new ArrayList<>();
    helper(root, list);
    return list;
  }

  void helper(TreeNode node, List<String> list){

      if (node == null) {
        list.add(null);
        return;
      }

      list.add(String.valueOf(node.val));

      helper(node.left, list);
      helper(node.right, list);
  }

  public TreeNode deserialize(List<String> list) {
    Collections.reverse(list);

    TreeNode node = helper2(list);
    return node;
  }

  private TreeNode helper2(List<String> list) {
      String val = list.remove(list.size() - 1);

      if (val.charAt(0) == 'n')
          return null;

      TreeNode node = new TreeNode(Integer.parseInt(val));

      node.left = helper2(list);
      node.right = helper2(list);

      return node;
  }
}



