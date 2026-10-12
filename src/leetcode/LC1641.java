package leetcode;

import java.util.Arrays;

public class LC1641 {
    /*
        Leetcode 1641. Count Sorted Vowel Strings
    */

    static int countVowelStrings(int n) {
        int[] dp = new int[] {0, 1, 1, 1, 1, 1};
        for (int i = 1; i <= n; ++i)
            for (int k = 1; k <= 5; ++k)
                dp[k] += dp[k - 1];
        return dp[5];
    }

    public static void main(String[] args) {
        System.out.println(countVowelStrings(1)); // Output: 5
        System.out.println(countVowelStrings(2)); // Output: 15
        System.out.println(countVowelStrings(33)); // Output: 66045
    }
}
