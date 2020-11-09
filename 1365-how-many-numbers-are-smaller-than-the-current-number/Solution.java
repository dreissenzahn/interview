
// Given the array nums, for each nums[i] find out how many
// numbers in the array are smaller than it. That is, for
// each nums[i] you have to count the number of valid j's
// such that j != i and nums[j] < nums[i].

// Return the answer in an array.

public class Solution {

  public static int[] smallerNumbersThanCurrent(int[] nums) {
    int[] count = new int[102];
    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++)
      count[nums[i]+1]++;

    for (int i = 1; i < 102; i++)
      count[i] += count[i-1];

    for (int i = 0; i < nums.length; i++)
      result[i] = count[nums[i]];

    return result;
  }

  public static void main(String[] args) {

    int[] nums = { 8, 1, 2, 2, 3 };
    
    System.out.println(smallerNumbersThanCurrent(nums));  // [4, 0, 1, 1, 3]
  }
}

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
