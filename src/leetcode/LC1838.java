package leetcode;

import java.util.Arrays;

public class LC1838 {
    /*
        Leetcode 1838. Frequency of the Most Frequent Element
    */

    static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0, r=0;
        long sum=0, res=0;
        while (r<nums.length){
            sum+=nums[r];
            while (sum+ k < nums[r]*(r-l+1L)){
                sum-=nums[l];
                l++;
            }
            res=Math.max(res, r-l+1L);
            r++;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(maxFrequency(new int[]{1,2,4}, 5)); // 3
        System.out.println(maxFrequency(new int[]{1,4,8,13}, 5)); // 2
        System.out.println(maxFrequency(new int[]{3,9,6}, 2)); // 1
    }
}
