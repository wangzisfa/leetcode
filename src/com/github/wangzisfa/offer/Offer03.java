package com.github.wangzisfa.offer;

import java.util.HashSet;

/**
 * Description:
 * <p>
 * date: 2022/01/05
 * <p>
 *
 * @author wangzisfa
 */
public class Offer03 {
    public static void main(String[] args) {
    
    }
    
    public int findRepeatNumber(int[] nums) {
        int[] repeats = new int[nums.length];
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                repeats[j++] = num;
            } else {
                set.add(num);
            }
        }
        
        return repeats[0];
    }
}
