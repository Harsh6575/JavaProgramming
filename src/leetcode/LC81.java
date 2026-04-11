package leetcode;

public class LC81{
    /*
    Leetcode 81. Search in Rotated Sorted Array II
    Binary Search
    */

    static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }
            
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            // left side sorted
            else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // right side sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 0));
        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 3));
        System.out.println(search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1}, 2)); // fails
    }
}