package leetcode;

import java.util.Stack;

public class LC150 {
     /*
        Leetcode 150. Evaluate Reverse Polish Notation
    */

    static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"})); // Output: 9
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"})); // Output: 6
        System.out.println(evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"})); // Output: 22
    }
}
