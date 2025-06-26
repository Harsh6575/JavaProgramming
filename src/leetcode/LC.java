package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LC {

    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
//        int[] ans = new int[Math.min(nums1.length,nums2.length)];
        for (int i = 0; i < nums1.length; i++) {
            while (nums1[i]==nums1[i+1]){
                i++;
            }
            int target=nums1[i];
            int temp = binarySearch(nums2,target);
            if(temp == -1){
                continue;
            }
            if(ans.contains(nums2[temp])) {
                continue;
            }
            ans.add(nums2[temp]);
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i]=ans.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2 = {1,1};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

}
