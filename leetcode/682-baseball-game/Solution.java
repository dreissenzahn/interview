import java.util.*;

// You are keeping score for a baseball game with strange
// rules. The game consists of several rounds, where the
// scores of past rounds may affect future rounds' scores.

// At the beginning of the game, you start with an empty
// record. You are given a list of strings ops, where ops[i]
// is the ith operation you must apply to the record and is
// one of the following:

// 1. An integer x - Record a new score of x.

// 2. "+" - Record a new score that is the sum of the
// previous two scores. It is guaranteed there will always
// be two previous scores.

// 3. "D" - Record a new score that is double the previous
// score. It is guaranteed there will always be a previous
// score.

// 4. "C" - Invalidate the previous score, removing it from
// the record. It is guaranteed there will always be a
// previous score.

// Return the sum of all the scores on the record.

public class Solution {

  public int calPoints(String[] ops) {
    int result = 0;
    Stack<Integer> stack = new Stack<>();
    
    for (int i = 0; i < ops.length; i++) {
      switch (ops[i]) {
        case "+":
          int a = stack.pop();
          int b = stack.pop();
          stack.push(b);
          stack.push(a);
          stack.push(a + b);
          result += a + b;
          break;
        case "D":
          int c = stack.peek();
          stack.push(2 * c);
          result += 2 * c;
          break;
        case "C":
          result -= stack.pop();
          break;
        default:
          int d = Integer.parseInt(ops[i]);
          stack.push(d);
          result += d;
      }
    }
    
    return result;
  }

  public static void main(String[] args) {

    String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };

    Solution solution = new Solution();

    System.out.println(solution.calPoints(ops));  // 27
  }
}
