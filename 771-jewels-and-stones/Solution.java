
// You're given strings J representing the types of stones
// that are jewels, and S representing the stones you have.
//  Each character in S is a type of stone you have. You
// want to know how many of the stones you have are also
// jewels.

// The letters in J are guaranteed distinct, and all
// characters in J and S are letters. Letters are case
// sensitive, so "a" is considered a different type of stone
// from "A".

public class Solution {

  public static int numJewelsInStones(String J, String S) {
    
    int result = 0;
    Set<Character> set = new HashSet<>();
    
    for (char j : J.toCharArray())
      set.add(j);
    
    for (char s : S.toCharArray())
      if (set.contains(s))
        result++;
    
    return result;
  }

  public static void main(String[] args) {
    
    String J = "aA";
    String S = "aAAbbbb";
    
    System.out.println(numJewelsInStones(J, S));  // 3
  }
}

// https://leetcode.com/problems/jewels-and-stones/
