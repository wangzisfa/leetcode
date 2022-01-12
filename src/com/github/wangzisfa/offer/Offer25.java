package com.github.wangzisfa.offer;

public class Offer25 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode collect = new ListNode(0);
		ListNode cur = collect;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				cur.next = l1;
				l1 = l1.next;
			} else {
				cur.next = l2;
				l2 = l2.next;
			}
			// System.out.println(cur.val);
			cur = cur.next;
		}
		cur.next = l1 != null ? l1 : l2;
		return collect.next;

	}
}
