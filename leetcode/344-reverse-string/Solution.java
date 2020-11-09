import java.util.*;

// Write a function that reverses a string. The input string
// is given as an array of characters char[].

// Do not allocate extra space for another array, you must
// do this by modifying the input array in-place with O(1)
// extra memory.

// You may assume all the characters consist of printable
// ascii characters.

public class Solution {

  public void reverseString(char[] s) {
    for (int i = 0; i < s.length / 2; i++)
      swap(s, i, s.length - 1 - i);
  }
  
  private void swap(char[] arr, int i, int j) {
    char tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  public static void main(String[] args) {
  
    char[] s = {'h', 'e', 'l', 'l', 'o'};

    Solution solution = new Solution();

    solution.reverseString(s);

    System.out.println(Arrays.toString(s));  // [o, l, l, e, h]
  }
}


