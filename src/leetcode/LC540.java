package leetcode;

public class LC540 {
     /*
        Leetcode 540. Single Element in a Sorted Array
        Binary Search
    */

    static int singleNonDuplicate(int[] nums) {
      int low=0,high=nums.length-1;
      while (low<high){
          int mid = low + (high-low)/2;
          if(mid%2==0){
              if(nums[mid]==nums[mid+1]){
                  low=mid+2;
              }else {
                  high=mid;
              }
          }else {
              if(nums[mid]==nums[mid-1]){
                  low=mid+1;
              }else {
                  high=mid-1;
              }
          }
      }
      return nums[low];
    }

    public static void main(String[] args) {
      System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
      System.out.println(singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }
}
