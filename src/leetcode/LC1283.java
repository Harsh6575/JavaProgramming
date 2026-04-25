package leetcode;

public class LC1283 {
    /*
        Leetcode 1283. Find the Smallest Divisor Given a Threshold
        Binary Search, Maths
    */

    static int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for (int num:nums){
            high=Math.max(high,num);
        }

        while (low<high){
            int mid=low+(high-low)/2;
            int sum=0;
            for (int num:nums){
                sum+=(num+mid-1)/mid;
            }
            if (sum>threshold){
                low=mid+1;
            }else {
                high=mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{1,2,5,9},6));
        System.out.println(smallestDivisor(new int[]{44,22,33,11,1},5));
    }
}
