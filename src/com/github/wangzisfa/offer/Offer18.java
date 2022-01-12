package com.github.wangzisfa.offer;

public class Offer18 {
	public ListNode deleteNode(ListNode head, int val) {
		ListNode cur = head;
		ListNode prev = head;
		while (cur != null) {
			if (cur.val == val) {
				if (cur == head) {
					return cur.next;
				}
				prev.next = cur.next;
			}
			prev = cur;
			cur = cur.next;
		}

		return head;
	}
}
