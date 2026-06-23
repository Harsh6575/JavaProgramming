package leetcode;

import java.util.Arrays;

public class LC1861 {
    /*
        Leetcode 1861. Rotate the Box
    */

    static char[][] rotateTheBox(char[][] boxGrid) {
        int rows = boxGrid.length;
        int cols = boxGrid[0].length;
        char[][] res = new char[cols][rows];
        for (int r = 0; r < cols; r++)
            for (int c = 0; c < rows; c++)
                res[r][c] = '.';
        
        for (int r = 0; r < rows; r++) {
            int p = cols - 1;
            for (int c = cols - 1; c >= 0; c--) {
                if (boxGrid[r][c] == '*') {
                    res[c][rows - 1 - r] = '*';
                    p = c - 1;
                } else if (boxGrid[r][c] == '#')
                    res[p--][rows - 1 - r] = '#';
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rotateTheBox(new char[][]{{'#','.','#'}}))); // [["."],["#"],["#"]]
        System.out.println(Arrays.deepToString(rotateTheBox(new char[][]{{'#','.','*','.'},{'#','#','*','.'}}))); // [["#","."],["#","#"],["*","*"],[".","."]]
    }
}
