package leetcode;

public class LC213 {

    /*
        Leetcode 213. House Robber II
     */

    static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        // Rob houses from index 0 to n-2
        int max1 = robLinear(nums, 0, nums.length - 2);
        // Rob houses from index 1 to n-1
        int max2 = robLinear(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    static int robLinear(int[] nums, int start, int end) {
        int prev1 = 0; // Max money robbed from the previous house
        int prev2 = 0; // Max money robbed from the house before the previous house

        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2, 3, 2})); // Output: 3
        System.out.println(rob(new int[]{1, 2, 3, 1})); // Output: 4
        System.out.println(rob(new int[]{1, 2, 3})); // Output: 3
    }
}