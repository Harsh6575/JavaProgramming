package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LC40 {
    /*
        Leetcode 40: Combination Sum II
    */

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); // sort to handle duplicates
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;        
    }
    private static void backtrack(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue; // skip duplicates
            if (candidates[i] > target) break; 
            path.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, path, res); // move to next index to avoid reuse
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
      System.out.println(combinationSum(new int[]{10,1,2,7,6,1,5}, 8));
      System.out.println(combinationSum(new int[]{2,5,2,1,2}, 5));
    }
}
