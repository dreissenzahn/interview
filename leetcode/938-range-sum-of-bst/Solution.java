
// Given the root node of a binary search tree, return the
// sum of values of all nodes with a value in the range
// [low, high].

public class Solution {
  
  public int rangeSumBST(TreeNode root, int low, int high) {
    if (root == null)
      return 0;
    
    if (root.val < low)
      return rangeSumBST(root.right, low, high);
    
    if (root.val > high)
      return rangeSumBST(root.left, low, high);
    
    return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
  }
}
