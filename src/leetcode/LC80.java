package leetcode;

public class LC80 {
    /*
        Leetcode 80. Remove Duplicates from Sorted Array II
        Two Pointers
    */
    static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }
}
