package com.github.wangzisfa.offer;

public class Offer24 {
	public ListNode reverseList(ListNode head) {
		if (head == null) return head;
		ListNode cur = head.next;
		ListNode prev = head;
		ListNode next;
		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			if (prev == head)
				prev.next = null;
			prev = cur;
			cur = next;
		}

		return prev;
	}
}
