package leetcode;

public class LC1312 {
    /*
        Leetcode 1312. Minimum Insertion Steps to Make a String Palindrome
        Dynamic Programming
    */

    static int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(minInsertions("zzazz")); // 0
        System.out.println(minInsertions("mbadm")); // 2
        System.out.println(minInsertions("leetcode")); // 5
    }
}
