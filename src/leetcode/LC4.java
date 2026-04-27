package leetcode;

import java.util.Arrays;

public class LC4 {
    /*
     * Leetcode 4. Median of Two Sorted Arrays
     * Binary Search
     */

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int cl = nums1.length+nums2.length;
        int[] c=new int[cl];

        System.arraycopy(nums1,0,c,0,nums1.length);
        System.arraycopy(nums2,0,c,nums1.length,nums2.length);

        Arrays.sort(c);

        if(cl%2==0){
            double median = (double)(c[(cl/2)-1]+ c[(cl/2)])/2;
            return median;
        }else{
            double median = c[((cl+1)/2)-1];
            return median;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2})); // 2.00000
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4})); // 2.50000
    }
}
