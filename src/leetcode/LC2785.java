package leetcode;

import java.util.Arrays;

public class LC2785 {
    /*
        Leetcode 2785. Sort Vowels in a String
    */

    static String sortVowels(String s) {
        char[] chars = s.toCharArray();
        StringBuilder vowels = new StringBuilder();
        for (char c : chars) {
            if (isVowel(c)) {
                vowels.append(c);
            }
        }
        char[] sortedVowels = vowels.toString().toCharArray();
        Arrays.sort(sortedVowels);
        int vowelIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                chars[i] = sortedVowels[vowelIndex++];
            }
        }
        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde")); // "lEOtcede"
        System.out.println(sortVowels("l;l")); // "l;l"
    }
}
