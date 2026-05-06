package leetcode;

import java.util.Arrays;

public class LC31 {
    /*
        Leetcode 31: Next Permutation
        Array
    */

    static void nextPermutation(int[] nums) {
        int index = -1;

        // step 1: find pivot
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // step 2: if no pivot → reverse whole array
        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // step 3: find next greater element
        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // step 4: reverse suffix
        reverse(nums, index + 1, nums.length - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{3, 2, 1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 1, 5};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
