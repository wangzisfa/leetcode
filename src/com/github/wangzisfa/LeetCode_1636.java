package com.github.wangzisfa;

import java.util.*;


/**
 * author wangzisfa
 * <br>
 * date 2022年1月4日
* */
public class LeetCode_1636 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(LeetCode_1636.testing(new int[]{-1, -1, 0, 2, 4, 4, 4, 6, 7, 9})));
	}
	
	/*
	* 实现内容是 给一组已经排好序的数组, 对该数组进行重组, 按照 出现次数升序排序, 如果出现次数相同的数 则按照降序进行排序.
	* */
	
	/*
	* 不使用 hashmap 的情况下
	* 同时要对其出现次数和数值进行记录
	* */
	public static int[] testing(int[] nums) {
		
		
		
		return new int[]{};
	}
	
	public int[] frequencySort(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<>(map.entrySet());
		arrayList.sort((o1, o2) -> o1.getValue().equals(o2.getValue()) ?
				(o2.getKey() - o1.getKey()) :
				(o1.getValue().compareTo(o2.getValue())));

		int[] res = new int[nums.length];
		int k = 0;
		for (Map.Entry<Integer, Integer> integerIntegerEntry : arrayList) {
			for (int j = 0; j < integerIntegerEntry.getValue(); j++) {
				res[k++] = integerIntegerEntry.getKey();
			}
		}
		return res;
	}

}
