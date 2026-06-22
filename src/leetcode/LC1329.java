package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LC1329 {
    /*
        Leetcode 1329. Sort the Matrix Diagonally
        Sorting, Matrix
    */

    static int[][] diagonalSort(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        Map<Integer, List<Integer>> diagonals = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
              int key = i - j;
                int val = mat[i][j];

                List<Integer> list = diagonals.getOrDefault(key, new ArrayList<>());
                list.add(val);

                diagonals.put(key, list);
            }
        }
        for(int key : diagonals.keySet()){
            Collections.sort(diagonals.get(key));
        }
        for(int i = row - 1; i >= 0; i--){
            for(int j = col - 1; j >= 0; j--){
                int key = i - j;
                int val = diagonals.get(key).remove(diagonals.get(key).size() - 1);
                mat[i][j] = val;
            }
        }
        return mat; 
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(diagonalSort(new int[][]{{3,3,1,1},{2,2,1,2},{1,1,1,2}})));
        System.out.println(Arrays.deepToString(diagonalSort(new int[][]{{11,25,66,1,69,7},{23,55,17,45,15,52},{75,31,36,44,58,8},{22,27,33,25,68,4},{84,28,14,11,5,50}})));
    }
}
