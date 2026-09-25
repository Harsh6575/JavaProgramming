package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC1074 {
    /*
        Leetcode 1074. Number of Submatrices That Sum to Target
        Hash Map, Prefix Sum
    */

    static int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        for (int top = 0; top < m; top++) {
            int[] colSum = new int[n];

            for (int bottom = top; bottom < m; bottom++) {
                for (int col = 0; col < n; col++) {
                    colSum[col] += matrix[bottom][col];
                }

                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);

                int sum = 0;

                for (int value : colSum) {
                    sum += value;
                    count += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numSubmatrixSumTarget(new int[][]{{0,1,0},{1,1,1},{0,1,0}}, 0)); // 4
        System.out.println(numSubmatrixSumTarget(new int[][]{{1,-1},{-1,1}}, 0)); // 5
        System.out.println(numSubmatrixSumTarget(new int[][]{{904}}, 0)); // 0
    }
}
