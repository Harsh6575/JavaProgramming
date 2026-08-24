package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LC944 {
    /*
        Leetcode 944. Rotting Oranges
        DFS
    */

   static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        // Find all rotten oranges and count fresh ones
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!queue.isEmpty() && fresh > 0) {

            int size = queue.size();

            // Process exactly one minute
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();

                int row = current[0];
                int col = current[1];

                for (int[] direction : directions) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];

                    if (newRow < 0 || newRow >= rows ||
                        newCol < 0 || newCol >= cols ||
                        grid[newRow][newCol] != 1) {
                        continue;
                    }

                    grid[newRow][newCol] = 2;
                    fresh--;

                    queue.offer(new int[]{newRow, newCol});
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
    
    public static void main(String[] args) {
        System.out.println(orangesRotting(new int[][]{
            {2, 1, 1}, 
            {1, 1, 0},
            {0, 1, 1}
        }));
    }
}