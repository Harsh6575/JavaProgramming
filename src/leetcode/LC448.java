package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC448 {
     /*
        Leetcode 448. Find All Numbers Disappeared in an Array
        Cycle Sort Algorithm
    */

    static void cycleSort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i] -1 ;
            if(arr[i]<=arr.length && arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        cycleSort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=(i+1)){
                ans.add(i+1);
            }
        }
        return ans;
    }

    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
