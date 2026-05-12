package leetcode;

public class LC424 {
     /*
        Leetcode 424. Longest Repeating Character Replacement
        Sliding Window, Two pointers
    */

    static int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxCount = 0;
        int[] count = new int[26];
        while (right < s.length()) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
            if (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return right - left;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2)); // 4
        System.out.println(characterReplacement("AABABBA", 1)); // 4
    }
}
