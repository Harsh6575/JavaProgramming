package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class LC496 {
     /*
        Leetcode 496. Next Greater Element I
        Array and HashMap
    */

    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && stack.get(stack.size() - 1) < nums2[i]) {
                map.put(stack.remove(stack.size() - 1), nums2[i]);
            }
            stack.add(nums2[i]);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4})));
    }
}
