
// We are given a list nums of integers representing a list
// compressed with run-length encoding.

// Consider each adjacent pair of elements [freq, val] =
// [nums[2*i], nums[2*i+1]] (with i >= 0). For each such
// pair, there are freq elements with value val concatenated
// in a sublist. Concatenate all the sublists from left to
// right to generate the decompressed list.

// Return the decompressed list.

public class Solution {
  
  public int[] decompressRLElist(int[] nums) {
    int length = 0;
    
    for (int i = 0; i < nums.length; i += 2)
      length += nums[i];
   
    int[] result = new int[length];
    int k = 0;
    
    for (int i = 0; i < nums.length; i += 2)
      for (int j = 0; j < nums[i]; j++)
        result[k++] = nums[i + 1];
    
    return result;
  }
}
