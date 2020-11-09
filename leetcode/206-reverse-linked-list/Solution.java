
// Reverse a singly linked list.

public class Solution {

  public ListNode reverseList(ListNode head) {
    ListNode trav = head;
    ListNode prev = null;
    
    while (trav != null) {
      ListNode temp = trav.next;
      trav.next = prev;
      prev = trav;
      trav = temp;
    }
        
    return prev;
  }

  private static class ListNode {
    private int value;
    private ListNode next;

    public ListNode() {}
    
    public ListNode(int value) {
      this.value = value;
    }
    
    public ListNode(int value, ListNode next) {
      this.value = value;
      this.next = next;
    }
  }

  public static void main(String[] args) {

    Solution solution = new Solution();

    ListNode third = new ListNode(3, null);
    ListNode second = new ListNode(2, third);
    ListNode first = new ListNode(1, second);
    ListNode head = new ListNode(0, first);

    ListNode trav = solution.reverseList(head);

    while (trav != null) {
      System.out.println(trav.value);
      trav = trav.next;
    }
  }
}

// https://leetcode.com/problems/reverse-linked-list/
