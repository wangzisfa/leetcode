package com.github.wangzisfa.offer;

public class Offer11 {
	public int minArray(int[] numbers) {
		if (numbers.length == 1) return numbers[0];
		int min = numbers[0];
		 for (int a : numbers) {
		     if (a < min) return a;
		 }

//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] < min) return numbers[i];
//		}
		return min;
	}
}
