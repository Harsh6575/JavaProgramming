package leetcode;

public class LC198 {

    /*
        Leetcode 198. House Robber
     */

    static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int prev2 = 0;
        int prev1 = 0;

        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        int[] houses1 = {1, 2, 3, 1};
        int[] houses2 = {2, 7, 9, 3, 1};

        System.out.println(rob(houses1)); // Output: 4
        System.out.println(rob(houses2)); // Output: 12
    }
}