package com.github.wangzisfa.offer;

import java.util.Stack;

public class Offer06 {
	public int[] reversePrint(ListNode head) {
		// List<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<>();
		while(head != null) {
			// list.add(head.val);
			stack.push(head.val);
			head = head.next;
		}
		//list.reverse
		//why not use stack?

		int[] res = new int[stack.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = stack.pop();
		}
		// int[] res = new int[list.length()];
		// for (int i = 0; i < res.length; i++) {
		//     res[i] = list.get(i);
		// }
		return res;
	}
}


class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}