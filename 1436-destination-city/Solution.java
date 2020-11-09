import java.util.*;

// You are given the array paths, where paths[i] = [cityA_i,
// cityB_i] means there exists a direct path going from
// cityA_i to cityB_i. Return the destination city, that is,
// the city without any path outgoing to another city.

// It is guaranteed that the graph of paths forms a line
// without any loop, therefore, there will be exactly one
// destination city.

// Input: paths = [["London","New York"],["New York",
// "Lima"],["Lima","Sao Paulo"]]
// Output: "Sao Paulo" 

public class Solution {

  public String destCity(List<List<String>> paths) {
    Set<String> set = new HashSet<>();
    
    // add all start points to the set
    for (List<String> p : paths)
      set.add(p.get(0));
    
    // find destination that is not a start point
    for (List<String> p : paths) {
      String dest = p.get(1);
      if (!set.contains(dest))
        return dest;
    }
    
    return null;
  }
 
  public static void main(String[] args) {
    List<String> list0 = new ArrayList<>();
    list0.add("London");
    list0.add("New York");

    List<String> list1 = new ArrayList<>();
    list1.add("New York");
    list1.add("Lima");

    List<String> list2 = new ArrayList<>();
    list2.add("Lima");
    list2.add("Sao Paulo");

    List<List<String>> list = new ArrayList<>();
    list.add(list0);
    list.add(list1);
    list.add(list2);
    
    Solution solution = new Solution();
    System.out.println(solution.destCity(list));  // "Sao Paulo"
  }
}

// https://leetcode.com/problems/running-sum-of-1d-array/
