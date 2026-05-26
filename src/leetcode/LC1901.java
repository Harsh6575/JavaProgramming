package leetcode;

import java.util.Arrays;

public class LC1901 {
    /*
        Leetcode 1901. Find a Peak Element II
    */

    static int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if ((i==0 || mat[i][j]>mat[i-1][j]) && (i==m-1 || mat[i][j]>mat[i+1][j]) && (j==0 || mat[i][j]>mat[i][j-1]) && (j==n-1 || mat[i][j]>mat[i][j+1])){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPeakGrid(new int[][]{{1,4},{3,2}})));
        System.out.println(Arrays.toString(findPeakGrid(new int[][]{{10,20,15},{21,30,14},{7,16,32}})));
    }
}
