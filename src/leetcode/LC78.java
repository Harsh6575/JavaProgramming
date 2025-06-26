package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC78 {
    /*
        Leetcode 78. Subsets
        Recursion
    */
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: nums) {
            int n=outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static int subsetXORSum(int[] nums) {
        List<List<Integer>> subsets = subsets(nums);
        int ans=0;
        for (int i = 0; i < subsets.size(); i++) {
            int temp=0;
            for (int j = 0; j < subsets.get(i).size(); j++) {
                temp=temp^subsets.get(i).get(j);
            }
            ans+=temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(subsetXORSum(new int[]{1,3}));
    }
}
