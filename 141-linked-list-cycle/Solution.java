
// Given head, the head of a linked list, determine if the
// linked list has a cycle in it.

// There is a cycle in a linked list if there is some node
// in the list that can be reached again by continuously
// following the next pointer. Internally, pos is used to
// denote the index of the node that tail's next pointer is
// connected to. Note that pos is not passed as a parameter.

// Return true if there is a cycle in the linked list.
// Otherwise, return false.

public class Solution {

  public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      System.out.println(slow.value);
      System.out.println(fast.value);
      
      if (slow == fast)
        return true;
    }
    
    return false;
  }

  private static class ListNode {
  
    private int value;
    private ListNode next;

    ListNode(int value) {
      this.value = value;
      this.next = next;
    }
  }

  public static void main(String[] args) {

    ListNode n0 = new ListNode(0);
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);

    n0.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n1;

    Solution solution = new Solution();
    System.out.println(solution.hasCycle(n0));
  }
}



// https://leetcode.com/problems/linked-list-cycle/
