package leetcode;

public class LC3195 {
    /*
        Leetcode 3195. Find the Minimum Area to Cover All Ones I

    */

    static int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int minRow = m, maxRow = -1, minCol = n, maxCol = -1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        if (minRow == m) {
            return 0; // No ones found
        }

        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }

    public static void main(String[] args) {
        System.out.println(minimumArea(new int[][]{{0,1,0},{1,0,1}})); // Output: 6
        System.out.println(minimumArea(new int[][]{{1,0},{0,0}})); // Output: 1
    }
}
