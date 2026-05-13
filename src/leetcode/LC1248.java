package leetcode;

public class LC1248 {
    /*
        Leetcode 1248. Count Number of Nice Subarrays
        Two Pointers, Sliding Window
    */

    static int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    static int atMost(int[] nums, int k) {
        int left = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 1) {
                k--;
            }
            while (k < 0) {
                if (nums[left] % 2 == 1) {
                    k++;
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1},3)); // 2
        System.out.println(numberOfSubarrays(new int[]{2,4,6},1)); // 0
        System.out.println(numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2},2)); // 16
    }
}
