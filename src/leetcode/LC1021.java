package leetcode;

public class LC1021 {
    /*
        Leetcode 1021. Remove Outermost Parentheses
        Stack, String
    */

    static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) sb.append(c);
                count++;
            } else {
                count--;
                if (count > 0) sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())")); // ()()()
        System.out.println(removeOuterParentheses("()()")); // ""
    }
}
