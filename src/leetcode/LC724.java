package leetcode;

import java.util.Arrays;

public class LC724 {
    /*
        Leetcode 724. Find Pivot Index
        Prefix Sum
    */
    static int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }

        int[] suffixSum = new int[nums.length];
        suffixSum[nums.length-1]=nums[nums.length-1];

        for (int i = nums.length-2; i >=0; i--) {
            suffixSum[i]=suffixSum[i+1]+nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(prefixSum[i]==suffixSum[i]){
                return i;
            }
        }
//        System.out.println(Arrays.toString(prefixSum));
//        System.out.println(Arrays.toString(suffixSum));
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}
