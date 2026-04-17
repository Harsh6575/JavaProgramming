package leetcode;

import java.util.Arrays;

public class LC242 {

    /*
        Leetcode 242. Valid Anagram
     */

    static boolean isAnagram(String s, String t) {
        char[] ch_s = s.toCharArray();
        char[] ch_t = t.toCharArray();
        Arrays.sort(ch_s);
        Arrays.sort(ch_t);
        return Arrays.equals(ch_s, ch_t);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}