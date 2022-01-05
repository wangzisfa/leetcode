package com.github.wangzisfa.offer;

/**
 * Description:
 * <p>
 * date: 2022/01/05
 * <p>
 *
 * @author wangzisfa
 */
public class Offer04 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}};
//        System.out.println(arr[0].length);
//        System.out.println(arr.length);
//        better way to use foreach
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(ints[j]);
            }
        }
    }
    
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] == target) return true;
            }
        }
        
        return false;
    }
}
