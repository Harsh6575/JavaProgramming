package leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class LC239 {

    /*
        Leetcode 239. Sliding Window Maximum
        Sliding Window
     */

    static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;
        // store index
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
          // remove numbers out of range k
          while (!q.isEmpty() && q.peek() < i - k + 1) {
            q.poll();
          }
          // remove smaller numbers in k range as they are useless
          while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
            q.pollLast();
          }
          // q contains index... r contains content
          q.offer(i);
          if (i >= k - 1) {
            result[ri++] = nums[q.peek()];
          }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3))); // Output: [3,3,5,5,6,7]
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1}, 1))); // Output: [1]
    }
}