package leetcode;

import java.util.Arrays;

public class LC2553 {
    /*
        Leetcode 2553. Separate the Digits in an Array
    */

    static int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        String s = sb.toString();
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i) - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(separateDigits(new int[]{13, 25, 83, 77}))); // [1, 3, 2, 5, 8, 3, 7, 7]
        System.out.println(Arrays.toString(separateDigits(new int[]{7, 1, 3, 9}))); // [7, 1, 3, 9]
    }
}
