import java.util.*;

// Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up
// to target.

// You may assume that each input would have exactly one
// solution, and you may not use the same element twice.

// You can return the answer in any order.

public class Solution {

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
          
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }

      map.put(nums[i], i);
    }
    
    return null;
  }

  public static void main(String[] args) {

    int[] nums = {2, 7, 11, 15};
    int target = 9;

    System.out.println(Arrays.toString(twoSum(nums, target)));

    // want: [0, 1]
  }
}

// https://leetcode.com/problems/two-sum/
