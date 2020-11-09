
// A self-dividing number is a number that is divisible by
// every digit it contains.

// For example, 128 is a self-dividing number because
// 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

// Also, a self-dividing number is not allowed to contain
// the digit zero.

// Given a lower and upper number bound, output a list of
// every possible self dividing number, including the bounds
// if possible.

class Solution {

  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> res = new ArrayList<>();
    for (int i = left; i <= right; i++)
      if (valid(i))
        res.add(i);
    return res;
  }

  private boolean valid(int n) {
    int m = n;
    while (m != 0) {
      int d = m % 10;
      if (d == 0 || n % d != 0)
        return false;
      m /= 10;
    }
    return true;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    System.out.println(solution.selfDividingNumbers(1, 22));  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
  }
}

// https://leetcode.com/problems/self-dividing-numbers/
