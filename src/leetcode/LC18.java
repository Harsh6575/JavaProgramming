package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LC18 {
    /*
        Leetcode 18. 4Sum
    */

    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return ans;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1; int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right&&nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<right&&nums[right]==nums[right+-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
      System.out.println(fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
      System.out.println(fourSum(new int[]{2, 2, 2, 2, 2}, 8));
      System.out.println(fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
    }
}
