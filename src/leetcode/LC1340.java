package leetcode;

public class LC1340 {
    /*
        Leetcode 1340. Jump Game V
        DP + DFS + Memoization
    */

    static int maxJumps(int[] arr, int d) {
        int n = arr.length;
        int[] dp = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, dfs(arr, d, i, dp));
        }

        return max;
    }

    static int dfs(int[] arr, int d, int i, int[] dp) {
        if (dp[i] != 0) {
            return dp[i];
        }

        dp[i] = 1;

        for (int j = i - 1; j >= Math.max(0, i - d); j--) {
            if (arr[j] >= arr[i]) {
                break;
            }
            dp[i] = Math.max(dp[i], 1 + dfs(arr, d, j, dp));
        }

        for (int j = i + 1; j <= Math.min(arr.length - 1, i + d); j++) {
            if (arr[j] >= arr[i]) {
                break;
            }
            dp[i] = Math.max(dp[i], 1 + dfs(arr, d, j, dp));
        }

        return dp[i];
    }

    public static void main(String[] args) {
        System.out.println(maxJumps(new int[]{6,4,14,6,8,13,9,7,10,6,12}, 2)); // 4
        System.out.println(maxJumps(new int[]{3,3,3,3,3}, 3)); // 1
        System.out.println(maxJumps(new int[]{7,6,5,4,3,2,1}, 1)); // 7
    }
}
