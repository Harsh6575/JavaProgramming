package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC2900 {
     /*
        Leetcode 2900. Longest Unequal Adjacent Groups Subsequence I
    */

    static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<String>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (i == 0 || groups[i] != groups[i - 1]) {
                result.add(words[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getLongestSubsequence(new String[]{"e", "a", "b"}, new int[]{0, 0, 1}));
        System.out.print(getLongestSubsequence(new String[]{"a", "b", "c", "d"}, new int[]{1, 0, 1, 1}));
    }
}
