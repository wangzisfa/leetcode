package com.github.wangzisfa.offer;

public class Offer08 {
}
//不多说 这玩意说是用两个stack做, 实际上还是用数组来的快
class CQueue {
	static final int MAX = 10010;
	int head = -1;
	int tail = -1;
	int[] arr = new int[10010];

	public CQueue() {

	}

	public void appendTail(int value) {
		arr[++tail % MAX] = value;
	}

	public int deleteHead() {
		if (head == tail) return -1;
		int res = arr[++head % MAX];
		arr[head % MAX] = 0;

		return res;
	}
}

// class CQueue {
//     Stack<Integer> s1 = new Stack<>();
//     Stack<Integer> s2 = new Stack<>();
//     public CQueue() {

//     }

//     public void appendTail(int value) {
//         s1.push(value);
//     }

//     public int deleteHead() {
//         if (s1.isEmpty()) return -1;
//         while (s1.size() != 1) {
//             s2.push(s1.pop());
//         }
//         int res = s1.pop();
//         while (!s2.isEmpty()) {
//             s1.push(s2.pop());
//         }
//         return res;
//     }
// }
