package leetcode;

public class LC567 {
     /*
        Leetcode 567. Permutation in String
    */

    static boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int left = 0, right = 0, count = s1.length();
        while (right < s2.length()) {
            if (s1Count[s2.charAt(right) - 'a'] > 0) {
                count--;
            }
            s1Count[s2.charAt(right) - 'a']--;
            right++;

            if (count == 0) {
                return true;
            }

            if (right - left == s1.length()) {
                if (s1Count[s2.charAt(left) - 'a'] >= 0) {
                    count++;
                }
                s1Count[s2.charAt(left) - 'a']++;
                left++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
        System.out.println(checkInclusion("ab", "eidboaoo"));
    }
}
