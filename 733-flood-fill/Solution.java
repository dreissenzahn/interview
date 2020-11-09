import java.util.*;

// An image is represented by a 2-D array of integers, each
// integer representing the pixel value of the image (from 0
// to 65535).

// Given a coordinate (sr, sc) representing the starting
// pixel (row and column) of the flood fill, and a pixel
// value newColor, "flood fill" the image.

// To perform a "flood fill", consider the starting pixel,
// plus any pixels connected 4-directionally to the starting
// pixel of the same color as the starting pixel, plus any
// pixels connected 4-directionally to those pixels (also
// with the same color as the starting pixel), and so on.
// Replace the color of all of the aforementioned pixels
// with the newColor.

// At the end, return the modified image.

public class Solution {

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int color = image[sr][sc];
    
    if (color == newColor)
      return image;
    
    floodFill(image, sr, sc, color, newColor);
    
    return image;
  }
  
  private void floodFill(int[][] image, int sr, int sc, int color, int newColor) {
    if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
      return;
  
    if (image[sr][sc] != color)
      return;
    
    image[sr][sc] = newColor;
    
    floodFill(image, sr + 1, sc, color, newColor);
    floodFill(image, sr - 1, sc, color, newColor);
    floodFill(image, sr, sc + 1, color, newColor);
    floodFill(image, sr, sc - 1, color, newColor);
  }

  public static void main(String[] args) {
    int[][] image = {
      {1, 1, 1},
      {1, 1, 0},
      {1, 0, 1},
    };

    int sr = 1;
    int sc = 1;

    int newColor = 2;

    Solution solution = new Solution();
    solution.floodFill(image, sr, sc, newColor);

    for (int[] r : image) {
      for (int c : r) {
        System.out.print(c + " ");
      }
      System.out.println();
    }

    // [[2,2,2],[2,2,0],[2,0,1]]
  }
}

// https://leetcode.com/problems/flood-fill/
