
// Write an algorithm to determine if a number n is "happy".

// A happy number is a number defined by the following
// process: Starting with any positive integer, replace the
// number by the sum of the squares of its digits, and
// repeat the process until the number equals 1 (where it
// will stay), or it loops endlessly in a cycle which does
// not include 1. Those numbers for which this process ends
// in 1 are happy numbers.

// Return True if n is a happy number, and False if not.

class Solution {
  
  private int digitSquareSum(int n) {
    int sum = 0;
    int tmp = 0;
    
    while (n != 0) {
      tmp = n % 10;
      sum += tmp * tmp;
      n /= 10;
    }
    
    return sum;
  }
  
  public boolean isHappy(int n) {
    int slow = n;
    int fast = n;
    
    do {
      slow = digitSquareSum(slow);
      fast = digitSquareSum(digitSquareSum(fast));
    } while (slow != fast);
    
    if (slow == 1)
      return true;
    
    return false;
  }

  public static void main(String[] args) {
    System.out.println(isHappy(19));  // true
  }
}
