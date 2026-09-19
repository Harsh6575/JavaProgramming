package leetcode;

import java.util.Arrays;

public class LC1561 {
    /*
        Leetcode 1561. Maximum Number of Coins You Can Get
    */

    static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans = 0;
        for (int i = piles.length / 3; i < piles.length; i += 2) {
            ans += piles[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] piles = {2, 4, 1, 2, 7, 8};
        System.out.println(maxCoins(piles));
    }
}
