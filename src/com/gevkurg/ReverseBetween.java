package com.gevkurg;

public class ReverseBetween {
  public ListNode reverseBetween(ListNode a, int m, int n) {
    if (a == null) return null;
    ListNode dummy = new ListNode(0);
    dummy.next = a;
    ListNode pre = dummy;
    for (int i = 0; i < m - 1; i++)
      pre = pre.next;

    ListNode start = pre.next;
    ListNode then = start.next;

    for (int i = 0; i < n - m; i++) {
      start.next = then.next;
      then.next = pre.next;
      pre.next = then;
      then = start.next;
    }

    return dummy.next;
  }

  class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
