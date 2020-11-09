
// Given an array nums. We define a running sum of an array
// as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

public class Solution {

  public int[] runningSum(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++)
      nums[i+1] += nums[i];
    
    return nums;
  }
 
  public static void main(String[] args) {
    Solution solution = new Solution();

    int[] nums = { 1, 2, 3, 4 };
    
    System.out.println(runningSum(nums));  // [1, 3, 6, 10]
  }
}

// https://leetcode.com/problems/running-sum-of-1d-array/
