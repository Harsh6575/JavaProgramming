package leetcode;

import java.util.List;
import java.util.Arrays;

public class LC139 {

    /*
        Leetcode 139. Word Break
     */

    static boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict == null || wordDict.isEmpty()) {
            return false;
        }

        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Base case: empty string can be segmented

        for (int i = 1; i <= n; i++) {
            for (String word : wordDict) {
                int len = word.length();
                if (i >= len && s.substring(i - len, i).equals(word)) {
                    dp[i] = dp[i] || dp[i - len];
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        List<String> wordDict1 = Arrays.asList("leet", "code");
        System.out.println(wordBreak("leetcode", wordDict1)); // Output: true

        wordDict1 = Arrays.asList("apple", "pen");
        System.out.println(wordBreak("applepenapple", wordDict1));

        wordDict1 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(wordBreak("catsandog", wordDict1));
    }
}