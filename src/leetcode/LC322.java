package leetcode;

public class LC322 {

    /*
        Leetcode 322. Coin change
     */

    static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11)); // Output: 3
        System.out.println(coinChange(new int[]{2}, 3)); // Output: -1
        System.out.println(coinChange(new int[]{1}, 0)); // Output: 0
    }
}