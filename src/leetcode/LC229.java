package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC229 {
     /*
        Leetcode 229. Majority Element II
    */

    static List<Integer> majorityElement(int[] nums) {
      Map<Integer, Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
          map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
      }
      List<Integer> ans = new ArrayList<>();
      for(Map.Entry<Integer, Integer> entry: map.entrySet()){
          if(entry.getValue()>nums.length/3) ans.add(entry.getKey());
      }
      return ans;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{1}));
        System.out.println(majorityElement(new int[]{1,2}));
    }
}
