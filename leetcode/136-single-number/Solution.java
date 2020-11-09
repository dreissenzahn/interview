
// Given a non-empty array of integers nums, every element
// appears twice except for one. Find that single one.

// Follow up: Could you implement a solution with a linear
// runtime complexity and without using extra memory?

public class Solution {
  
  public int singleNumber(int[] nums) {
    int result = 0;
    for (int n : nums)
      result ^= n;
    return result;
  }

  public static void main(String[] args) {

    int[] nums = {2, 1, 4, 5, 2, 4, 1};

    Solution solution = new Solution();

    System.out.println(solution.singleNumber(nums));  // 5

    // [2,1,4,5,2,4,1]

    // = 0 ^ 2 ^ 1 ^ 4 ^ 5 ^ 2 ^ 4 ^ 1
    // = 0 ^ 2 ^ 2 ^ 1 ^ 1 ^ 4 ^ 4 ^ 5
    // = 0 ^ 0 ^ 0 ^ 0 ^ 5
    // = 5
  }
}



