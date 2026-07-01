package leetcode;

import java.util.List;
import java.util.ArrayList;

public class LC132 {
     /*
        Leetcode 132. Palindrome Partitioning II
    */

    static int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        for(int i=0; i<n; i++){
            dp[i] = i; // maximum cuts
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(isPalindrome(s, j, i)){
                    if(j == 0){
                        dp[i] = 0;
                    } else {
                        dp[i] = Math.min(dp[i], dp[j-1] + 1);
                    }
                }
            }
        }
        return dp[n-1];   
    }

    static boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(minCut("aab")); // Output: 1
        System.out.println(minCut("a")); // Output: 0
        System.out.println(minCut("ab")); // Output: 1
    }
}
