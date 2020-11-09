
// Given two strings s and t, write a function to determine
// if t is an anagram of s.

// You may assume the string contains only lowercase
// alphabets.

public class Solution {

  public static boolean isAnagram(String s, String t) {
    int[] count = new int[26];
    
    for (int i = 0; i < s.length(); i++)
      count[s.charAt(i) - 'a']++;
    
    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      if(count[c -'a'] == 0)
        return false;
      count[c - 'a']--;
    }
    
    for (int i = 0; i < count.length; i++)
      if (count[i] != 0)
        return false;
    
    return true;
  }

  public static void main(String[] args) {
    
    String s = "anagram";
    String t = "nagaram";

    System.out.println(isAnagram(s, t));  // true
  }
}

// 