package leetcode;

import java.util.Stack;

public class LC402 {
     /*
        Leetcode 402. Remove K Digits
    */

    static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // Remove remaining digits from the end if k > 0
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        result.reverse();

        // Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.length() == 0 ? "0" : result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3)); // Output: "1219"
        System.out.println(removeKdigits("10200", 1)); // Output: "200"
        System.out.println(removeKdigits("10", 2)); // Output: "0"
    }
}
