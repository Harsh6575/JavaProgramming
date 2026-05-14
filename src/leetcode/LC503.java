package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class LC503 {
     /*
        Leetcode 503. Next Greater Element II
        Array and HashMap
    */

    static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {

            int current = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] < current) {
                int index = stack.pop();
                res[index] = current;
            }

            // only push first pass
            if (i < n) {
                stack.push(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{1,2,1}))); // Output: [2,-1,2]
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{1,2,3,4,3}))); // Output: [2,3,4,-1,4]
    }
}
