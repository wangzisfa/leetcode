package com.github.wangzisfa;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA
 *
 * @Author: wangzisfa
 * @Date: 2021/09/08
 * @Description:
 */
public class LeetCode_204 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countPrimes(10));
    }
    
    static class Solution {
        public int countPrimes(int n) {
            boolean[] isPrime = new boolean[n];
            int sum = 0;
            Arrays.fill(isPrime, true);
            
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    sum++;
                    if ((long) i * i < n) {
                        for (int j = i * i; j < n; j += i) {
                            isPrime[j] = false;
                        }
                    }
                }
            }
            
            return sum;
        }
    }
}
