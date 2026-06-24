package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LC3446 {
    /*
        Leetcode 3446. Sort Matrix by Diagonals
        Sorting, Matrix
    */

    static int[][] sortMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Map<Integer, List<Integer>> diagonals = new HashMap<>();

        // Collect elements of each diagonal
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diagonals.computeIfAbsent(i - j, k -> new ArrayList<>())
                        .add(grid[i][j]);
            }
        }

        // Sort according to problem requirements
        for (int key : diagonals.keySet()) {
            if (key >= 0) {
                diagonals.get(key).sort(Collections.reverseOrder()); // descending
            } else {
                Collections.sort(diagonals.get(key)); // ascending
            }
        }

        // Refill matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                grid[i][j] = diagonals.get(key).remove(0);
            }
        }

        return grid;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(sortMatrix(new int[][]{{1,7,3},{9,8,2},{4,5,6}})));
        System.out.println(Arrays.deepToString(sortMatrix(new int[][]{{0,1},{1,2}})));
    }
}
