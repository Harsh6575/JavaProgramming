package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC22 {
    /*
        Leetcode 22. Generate Parentheses
        Recursive backtracking solution
    */

    static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n <= 0) {
            return ans;
        }
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    private static void backtrack(List<String> ans, StringBuilder sb, int open, int close, int n) {
        if (sb.length() == 2 * n) {
            ans.add(sb.toString());
            return;
        }
        if (open < n) {
            sb.append('(');
            backtrack(ans, sb, open + 1, close, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(')');
            backtrack(ans, sb, open, close + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
      System.out.println(generateParenthesis(3));
      System.out.println(generateParenthesis(1));
    }
}
