package leetcode;

import java.util.Stack;

public class LC739 {
     /*
        Leetcode 739. Daily Temperatures
    */

    static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
