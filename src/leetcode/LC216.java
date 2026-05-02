package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC216 {
    /*
        Leetcode 216: Combination Sum III
    */

    static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), res);
        return res;
    }

    private static void backtrack(int start, int k, int target, List<Integer> path, List<List<Integer>> res) {
        if (target == 0 && path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (i > target) break; 
            path.add(i);
            backtrack(i + 1, k, target - i, path, res); // move to next index to avoid reuse
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
      System.out.println(combinationSum3(3, 7));
      System.out.println(combinationSum3(3, 9));
    }
}
