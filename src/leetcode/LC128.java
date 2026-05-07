package leetcode;

import java.util.HashMap;

public class LC128 {
     /*
        Leetcode 128. Longest Consecutive Sequence
    */

    static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], false);
        }
        for(int key: hm.keySet()){
            if(hm.containsKey(key-1) == false){
                hm.put(key, true);
            }
        }
        int max = 0;

        for(int key: hm.keySet()){
            int k = 1;
            if(hm.get(key) == true){
                while(hm.containsKey(key+k)==true){
                    k++;
                }
            }
            max = Math.max(max, k);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}
