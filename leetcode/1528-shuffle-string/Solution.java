
// Given a string s and an integer array indices of the same
// length.

// The string s will be shuffled such that the character at
// the ith position moves to indices[i] in the shuffled
// string.

// Return the shuffled string.

public class Solution {

  public String restoreString(String s, int[] indices) {
    char[] result = new char[indices.length];
    
    for (int i = 0; i < indices.length; i++)
      result[indices[i]] = s.charAt(i);
      
    return new String(result);
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    String s = "codeleet";
    int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };

    System.out.println(solution.restoreString(s, indices));  // "leetcode"
  }
}
