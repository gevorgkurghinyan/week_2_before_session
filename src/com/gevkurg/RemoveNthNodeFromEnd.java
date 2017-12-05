package com.gevkurg;

public class RemoveNthNodeFromEnd {
  public ListNode removeNthFromEnd(ListNode a, int b) {
    if (a == null || b < 1) {
      return null;
    }

    int length = 0;
    ListNode node = a;

    while (node != null) {
      ++length;
      node = node.next;
    }

    if (b >= length) {
      return a.next;
    }

    ListNode pre = a;
    node = a;
    for (int i = 0; i < length - b; ++i) {
      pre = node;
      node = node.next;
    }

    pre.next = pre.next.next;

    return a;
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
