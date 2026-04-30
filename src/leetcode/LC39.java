package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC39 {
    /*
        Leetcode 39: Combination Sum
    */

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            if (candidates[i] <= target) {
                path.add(candidates[i]);
                backtrack(candidates, target - candidates[i], i, path, res);
                path.remove(path.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
      System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
      System.out.println(combinationSum(new int[]{2,3,5}, 8));
    }
}
