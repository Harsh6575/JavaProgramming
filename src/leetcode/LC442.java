package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC442 {
     /*
        Leetcode 442. Find All Duplicates in an Array
        Cycle Sort Algorithm
    */

    static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct = nums[i] - 1;
            if (nums[correct] != nums[i]) {
                swap(nums, i, correct);
            }else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        List<Integer> ans = new ArrayList<Integer>();
        for (int it = 0; it < nums.length; it++) {
            if(nums[it]!=(it+1)){
                ans.add(nums[it]);
            }
        }
        return ans;

//        boolean[] present = new boolean[nums.length];
//        List<Integer> ans = new ArrayList<Integer>();
//        for (int num: nums) {
//            if(!present[num - 1]){
//                present[num -1] = true;
//            }else {
//                ans.add(num);
//            }
//        }
//        return ans;
    }

    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
}
