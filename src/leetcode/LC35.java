package leetcode;

public class LC35 {
    /*
        Leetcode 35: Search Insert Position
        Binary Search Algorithm
    */

    static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return end+1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        System.out.println(searchInsert(arr,7));
    }
}
