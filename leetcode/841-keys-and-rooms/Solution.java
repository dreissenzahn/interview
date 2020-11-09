import java.util.*;

// There are N rooms and you start in room 0.  Each room has
// a distinct number in 0, 1, 2, ..., N-1, and each room may
// have some keys to access the next room. 

// Formally, each room i has a list of keys rooms[i], and
// each key rooms[i][j] is an integer in [0, 1, ..., N-1]
// where N = rooms.length.  A key rooms[i][j] = v opens the
// room with number v.

// Initially, all the rooms start locked (except for room
// 0). 

// You can walk back and forth between rooms freely.

// Return true if and only if you can enter every room.


public class Solution {

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean[] visited = new boolean[rooms.size()];
    Stack<Integer> stack = new Stack<>();
    
    visited[0] = true;
    stack.push(0);
    
    while (!stack.isEmpty()) {
      int r = stack.pop();
      for (int k : rooms.get(r)) {
        if (!visited[k]) {
          visited[k] = true;
          stack.push(k);
        }
      }
    }
    
    for (boolean v : visited)
      if (!v)
        return false;
    
    return true;
  }

  public static void main(String[] args) {
    
    ArrayList<Integer> room0 = new ArrayList<>();
    room0.add(1);
    
    ArrayList<Integer> room1 = new ArrayList<>();
    room1.add(2);
    
    ArrayList<Integer> room2 = new ArrayList<>();
    room2.add(3);

    List<List<Integer>> rooms = new ArrayList<>();

    rooms.add(room0);
    rooms.add(room1);
    rooms.add(room2);
    rooms.add(new ArrayList<>());

    Solution solution = new Solution();

    System.out.println(solution.canVisitAllRooms(rooms));
  }
}

// https://leetcode.com/problems/keys-and-rooms/
