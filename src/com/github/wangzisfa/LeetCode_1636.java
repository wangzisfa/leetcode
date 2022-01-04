package com.github.wangzisfa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/**
 * author wangzisfa
 * <br>
 * date 2022年1月4日
* */
public class LeetCode_1636 {

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
