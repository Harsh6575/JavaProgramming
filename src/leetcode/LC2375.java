package leetcode;

import java.util.Stack;

public class LC2375 {
    /*
        Leetcode 2375. Construct Smallest Number From DI String
    */

    static String smallestNumber(String pattern) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= pattern.length(); i++) {
            stack.push(i + 1);

            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(smallestNumber("IIIDIDDD")); // 123549876
        System.out.println(smallestNumber("DDD")); // 4321
        System.out.println(smallestNumber("IIDDD")); // 126543
    }
}
