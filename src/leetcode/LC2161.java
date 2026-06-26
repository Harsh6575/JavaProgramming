package leetcode;

import java.util.Arrays;

public class LC2161 {
    /*
        Leetcode 2161. Partition Array According to Given Pivot
    */

    static int[] partitionArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int index = 0;
        // Less than pivot
        for (int num : nums) {
            if (num < pivot) {
                ans[index++] = num;
            }
        }
        // Equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                ans[index++] = num;
            }
        }
        // Greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                ans[index++] = num;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
      System.out.println(Arrays.toString(partitionArray(new int[]{9,12,5,10,14,3,10}, 10))); // 9,5,3,10,10,12,14
      System.out.println(Arrays.toString(partitionArray(new int[]{-3,4,3,2}, 2))); // -3,2,4,3
    }
}
