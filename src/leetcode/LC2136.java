package leetcode;

import java.util.Arrays;

public class LC2136 {
    /*
        Leetcode 2136. Earliest Possible Day of Full Bloom
    */

    static int earliestFullBloom(int[] plantTime, int[] growTime) {
        int result = 0, n = plantTime.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = plantTime[i];
            arr[i][1] = growTime[i];
        }
        // Sort by grow time in descending order
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        int plantingDay = 0;
        for (int[] pair : arr) {
            plantingDay += pair[0];
            result = Math.max(result, plantingDay + pair[1]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(earliestFullBloom(new int[]{1,4,3}, new int[]{2,3,1})); // 9
        System.out.println(earliestFullBloom(new int[]{1,2,3,2}, new int[]{2,1,2,1})); // 9
        System.out.println(earliestFullBloom(new int[]{1}, new int[]{1})); // 2
    }
}
