package com.github.wangzisfa.offer;

public class Offer10 {
}

//I-斐波那契数列
class Solution {

	public int fib(int n) {
		int a = 0, b = 1;
		int sum;

		for (int i = 0; i < n; i++) {
			//直接模, 不要用1e9 + 7 涉及强制转换
			sum = (a + b) % 1000000007;
			a = b;
			b = sum;
		}

		return a;
	}
}


//II-青蛙跳台阶问题
//一模一样