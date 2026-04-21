package leetcode;

import java.util.Arrays;

public class LC2149 {
    /*
        Leetcode 2149. Rearrange Array Elements by Sign
    */

    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0, neg = 1;
        for (int num : nums) {
            if (num > 0) {
                ans[pos] = num;
                pos += 2;
            } else {
                ans[neg] = num;
                neg += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
      System.out.println(Arrays.toString(rearrangeArray(new int[]{3, 1, -2, -5, 2, -4})));
      System.out.println(Arrays.toString(rearrangeArray(new int[]{-1, 1})));
    }
}
