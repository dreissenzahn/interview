import java.util.*;

// Invert a binary tree.

//   1
//  / \
// 2   3
//   /  \
//  4    5   

//      1
//     / \
//    3   2
//  /  \
// 5    4


public class Solution {

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    tree.insert(2);
    tree.insert(1);
    tree.insert(4);
    tree.insert(3);
    tree.insert(5);

    tree.invertTree();
  }
}

class BinaryTree {

  private Node root = null;

  public void insert(int key) {
    root = insert(root, key);
  }

  private Node insert(Node node, int key) {
    if (node == null)
      return new Node(key);

    if (key < node.key) {
      node.left = insert(node.left, key);
    } else {
      node.right = insert(node.right, key);
    }

    return node;
  }

  public void invertTree() {
    root = invertTree(root);
  }

  private Node invertTree(Node node) {
    if (node == null)
      return null;
    
    Node right = invertTree(node.right);
    Node left = invertTree(node.left);

    node.left = right;
    node.right = left;

    return node;
  }

  private static class Node {

    public int key;
    public Node left;
    public Node right;

    public Node(int key) {
      this.key = key;
    }
  }
}

// https://leetcode.com/problems/invert-binary-tree/
