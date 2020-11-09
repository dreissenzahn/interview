
public class Solution {
  
  public String toLowerCase(String str) {
    int offset = 'a' - 'A';
    
    char[] result = str.toCharArray();
    
    for (int i = 0; i < result.length; i++)
      if ('A' <= result[i] && result[i] <= 'Z')
        result[i] = (char) (result[i] + offset);

    return new String(result);
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    System.out.println(solution.toLowerCase("Hello"));  // hello
  }
}

