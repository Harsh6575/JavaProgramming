package leetcode;

import java.util.Arrays;

public class LC2551 {
    /*
        Leetcode LC2551. Put Marbles in Bags
        Heap, Greedy
    */

    static long putMarbles(int[] weights, int k) {
        int n = weights.length;
        long[] sums = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            sums[i] = weights[i] + weights[i + 1];
        }

        Arrays.sort(sums);
        long minSum = 0, maxSum = 0;
        for (int i = 0; i < k - 1; i++) {
            minSum += sums[i];
            maxSum += sums[n - 2 - i];
        }

        return maxSum - minSum;
    }
    
    public static void main(String[] args) {
        System.out.println(putMarbles(new int[]{1,3,5,1}, 2)); // 4
        System.out.println(putMarbles(new int[]{1, 3}, 2)); // 0
    }
}
