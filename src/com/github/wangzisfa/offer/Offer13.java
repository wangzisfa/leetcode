package com.github.wangzisfa.offer;

import java.util.Arrays;

/**
 * Description:
 * <p>
 * date: 2022/01/09
 * <p>
 *
 * @author wangzisfa
 */
public class Offer13 {
    public static void main(String[] args) {
        Offer13 o = new Offer13();
//        System.out.println(o.movingCount(16, 8, 4));
        System.out.println(Arrays.toString(new boolean[1]));
    }
    
    //想错了, 实际上和连通图也有点关系
//    public int movingCount(int m, int n, int k) {
        //将每行每列中的行列数拆为可读的数字之和.
        //如 [10][23] 拆为 1 + 0 + 2 + 3 = 6
        //创建一个 一维数组存储得到的结果, 最终遍历得结果.
//        System.out.println(m + " " + n + " " + k);
//        int[] res = new int[m * n];
//        int cur = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.println("current i: " + i + " after: " + split(i));
//                System.out.println("current j: " + j + " after: " + split(j));
//                res[cur++] = split(i) + split(j);
//            }
//        }
//
//        int r = 0;
//        for (int i = 0; i < res.length; i++) {
//            if (res[i] <= k) r++;
//        }
//        return r;
//        return -1;
//    }


    //数位和增量公式
    //当 (x + 1) ⊙ 10 = 0 时:  s(x+1) = sx - 8
    //当 (x + 1) ⊙ 10 != 0 时: s(x+1) = sx + 1
    int m, n, k;
    int[][] visited;
    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;

        visited = new int[m][n];

        return dfs(0, 0, 0, 0);
    }

    public int dfs(int i, int j, int si, int sj) {
        if (i >= m || j >= n || si + sj > k || visited[i][j] == 1) return 0;
        visited[i][j] = 1;
        return 1 + dfs(i + 1, j, (i + 1) % 10 == 0 ? si - 8 : si + 1, sj) + dfs(i, j + 1, si, (j + 1) % 10 == 0 ? sj - 8 : sj + 1);
    }


//    public int split(int a) {
//        int res = 0;
//        while (a > 0) {
//            res += a % 10;
//            a /= 10;
//        }
//
//        return res;
//    }
}
