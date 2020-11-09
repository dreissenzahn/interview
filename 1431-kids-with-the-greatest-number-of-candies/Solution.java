import java.util.*;

// Given the array candies and the integer extraCandies,
// where candies[i] represents the number of candies that
// the ith kid has.

// For each kid check if there is a way to distribute
// extraCandies among the kids such that he or she can have
// the greatest number of candies among them. Notice that
// multiple kids can have the greatest number of candies.

public class Solution {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    
    int max = 0;
    for (int candy : candies)
      if (candy > max)
        max = candy;
    
    List<Boolean> result = new ArrayList<>(candies.length);
    for (int candy : candies)
      result.add(candy + extraCandies >= max);
    
    return result;
  }

  public static void main(String[] args) {
    int[] candies = {2, 3, 5, 1, 3};
    int extraCandies = 3;

    Solution solution = new Solution();
    
    System.out.println(solution.kidsWithCandies(candies, extraCandies));  // [true, true, true, false, true]
  }
}
