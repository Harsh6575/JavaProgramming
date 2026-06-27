package leetcode;

import java.util.Arrays;

public class LC1828 {
    /*
        Leetcode 1828. Queries on Number of Points Inside a Circle
    */

    static int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = 0; j < points.length; j++) {
                if (Math.pow(points[j][0] - queries[i][0], 2) + Math.pow(points[j][1] - queries[i][1], 2) <= Math.pow(queries[i][2], 2)) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPoints(new int[][]{{1,3},{3,3},{5,3},{2,2}}, new int[][]{{2,3,1},{4,3,1},{1,1,2}}))); // [3,2,2]
        System.out.println(Arrays.toString(countPoints(new int[][]{{1,1},{2,2},{3,3},{4,4},{5,5}}, new int[][]{{1,2,2},{2,2,2},{4,3,2},{4,3,3}}))); // [2,3,2,4]
    }
}
