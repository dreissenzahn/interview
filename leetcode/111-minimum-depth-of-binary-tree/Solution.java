
// Given a binary tree, find its minimum depth.

// The minimum depth is the number of nodes along the
// shortest path from the root node down to the nearest leaf
// node.

// Note: A leaf is a node with no children.

// Example:

// Input: root = [3,9,20,null,null,15,7]
// Output: 2

//    3
//  /  \
// 9   20
//    /  \
//   15   7


public class Solution {

  public static int minDepth(TreeNode root) {
    if (root == null)
      return 0;
    
    if (root.left == null)
      return minDepth(root.right) + 1;
    
    if (root.right == null)
      return minDepth(root.left) + 1;
    
    return Math.min(minDepth(root.right), minDepth(root.left)) + 1;
  }

  private static class TreeNode {
  
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
}

// https://leetcode.com/problems/minimum-depth-of-binary-tree/
