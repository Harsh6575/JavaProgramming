package leetcode;

public class LC91 {

    /*
        Leetcode 91. Decode Ways
     */

    static int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: empty string has one way to decode
        dp[1] = 1; // Base case: single character (not '0') has one way to decode

        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));

            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("12")); // Output: 2
        System.out.println(numDecodings("226")); // Output: 3
        System.out.println(numDecodings("06")); // Output: 0
    }
}