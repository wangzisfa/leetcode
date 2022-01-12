package com.github.wangzisfa.offer;

public class Offer22 {
//	public ListNode getKthFromEnd(ListNode head, int k) {
//		ListNode cur = head;
//		int curNum = 1;
//		int size = 1;
//		while (cur != null) {
//			cur = cur.next;
//			size++;
//		}
//
//		cur = head;
//		while (cur != null) {
//			if (curNum == size - k) return cur;
//			//System.out.println(size - k + " " + curNum);
//			cur = cur.next;
//			curNum++;
//		}
//
//		return cur;
//	}


	//双指针
	public ListNode getKthFromEnd(ListNode head, int k) {
		ListNode cur = head;
		ListNode prev = head;
		int tmp = 0;
		while (cur != null) {
			if (tmp != k) {
				cur = cur.next;
				tmp++;
			} else {
				cur = cur.next;
				prev = prev.next;
			}
		}
		return prev;
	}
}
