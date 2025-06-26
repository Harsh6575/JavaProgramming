package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutations {
//    static List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> outer = new ArrayList<>();
//        Arrays.sort(nums);
//        backtrack(outer, new ArrayList<Integer>(),nums,0);
//        return outer;
//    }
//
//    static void backtrack(List<List<Integer>> outer,List<Integer> temp,int[] nums,int start){
//        outer.add(new ArrayList<>(temp));
//        for (int i =start; i < temp.size(); i++) {
//            temp.add(nums[i]);
//            backtrack(outer, temp, nums, i + 1);
//            temp.remove(temp.size() - 1);
//        }
//    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
}
