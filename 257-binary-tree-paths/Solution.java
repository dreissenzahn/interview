
// Given a binary tree, return all root-to-leaf paths.

// Note: A leaf is a node with no children.

// Input:

//    1
//  /   \
// 2     3
//  \
//   5

// Output: ["1->2->5", "1->3"]

// Explanation: All root-to-leaf paths are: 1->2->5, 1->3


public class Solution {
  
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> list = new ArrayList<>();
    binaryTreePaths(root, list, "");  
    return list;
  }
  
  private void binaryTreePaths(TreeNode node, List<String> list, String path) {
    if (node == null)
      return;
    
    if (node.left == null && node.right == null) {
      list.add(path + node.val);
      return;
    }
    
    binaryTreePaths(node.right, list, path + node.val + "->");
    binaryTreePaths(node.left, list, path + node.val + "->");
  }

  public class TreeNode {

    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
      this.val = val;
    }
    
    public TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public static void main(String[] args) {

  }
}

// https://leetcode.com/problems/binary-tree-paths/
