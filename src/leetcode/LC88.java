package leetcode;

import java.util.Arrays;

public class LC88 {
    /*
        Leetcode 88. Merge Sorted Array
        Recursion
    */
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[nums1.length];
        int i=0,j=0,k=0;
        while (i<m&&j<n){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                i++;
            }else {
                ans[k]=nums2[j];
                j++;
            }
            k++;
        }
        while (i<m){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while (j<n){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        nums1=ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
