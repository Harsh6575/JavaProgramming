package leetcode;

import java.util.Stack;
import java.util.Arrays;

public class LC735 {
     /*
        Leetcode 735. Asteroid Collision
    */

    static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, 10, -5}))); // Output: [5, 10]
        System.out.println(Arrays.toString(asteroidCollision(new int[]{8, -8}))); // Output: []
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10, 2, -5}))); // Output: [10]
    }
}
