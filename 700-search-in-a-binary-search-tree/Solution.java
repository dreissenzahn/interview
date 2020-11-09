
// Given the root node of a binary search tree (BST) and a
// value. You need to find the node in the BST that the
// node's value equals the given value. Return the subtree
// rooted with that node. If such node doesn't exist, you
// should return NULL.

// For example, 

// Given the tree:

//         4
//        / \
//       2   7
//      / \
//     1   3

// And the value to search: 2

// You should return this subtree:

//       2     
//      / \   
//     1   3

// In the example above, if we want to search the value 5,
// since there is no node with value 5, we should return
// NULL.

// Note that an empty tree is represented by NULL, therefore
// you would see the expected output (serialized tree
// format) as [], not null.

class Solution {

  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null)
      return null;
    
    if (root.val == val)
      return root;
    else if (root.val < val)
      return searchBST(root.right, val);
    else
      return searchBST(root.left, val);
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

  public static void main(String[] args) {
    Solution solution = new Solution();

    TreeNode n4 = new TreeNode(4);
    TreeNode n2 = new TreeNode(2);
    TreeNode n7 = new TreeNode(7);
    TreeNode n1 = new TreeNode(1);
    TreeNode n3 = new TreeNode(3);

    n4.right = n7;
    n4.left = n2;

    n2.right = n3;
    n2.left = n1;

    TreeNode result = solution.searchBST(n4, 3);

    System.out.println(result.val);  // 3
  }
}

// https://leetcode.com/problems/search-in-a-binary-search-tree/
