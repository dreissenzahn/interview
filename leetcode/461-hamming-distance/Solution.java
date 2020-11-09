
public class Solution {

  public int hammingDistance(int x, int y) {
    int result = 0;
    
    while (x != 0 || y != 0) {
      boolean a = (x % 2 == 1);
      boolean b = (y % 2 == 1);
      
      if (a ^ b)
        result++;
      
      x /= 2;
      y /= 2;
    }
    
    return result;
  }

  public static void main(String[] args) {

    int x = 1;
    int y = 4;

    Solution solution = new Solution();

    System.out.println(solution.hammingDistance(x, y));  // 2
  }
}
