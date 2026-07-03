package leetcode;

import java.util.Arrays;

public class LC1840 {
    /*
        Leetcode 181840. Maximum Building Height
    */

    static int maxBuilding(int n, int[][] restrictions) {
        if (restrictions.length == 0) {
            return n - 1;
        }

        int m = restrictions.length;

        // Add building 1 with height 0
        int[][] arr = new int[m + 1][2];
        arr[0][0] = 1;
        arr[0][1] = 0;

        for (int i = 0; i < m; i++) {
            arr[i + 1] = restrictions[i];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Left to right
        for (int i = 1; i < arr.length; i++) {
            arr[i][1] = Math.min(
                    arr[i][1],
                    arr[i - 1][1] + (arr[i][0] - arr[i - 1][0])
            );
        }

        // Right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i][1] = Math.min(
                    arr[i][1],
                    arr[i + 1][1] + (arr[i + 1][0] - arr[i][0])
            );
        }

        int ans = 0;

        // Maximum height between consecutive restrictions
        for (int i = 1; i < arr.length; i++) {
            int dist = arr[i][0] - arr[i - 1][0];
            int h1 = arr[i - 1][1];
            int h2 = arr[i][1];

            ans = Math.max(ans, (dist + h1 + h2) / 2);
        }

        // Buildings after the last restriction
        ans = Math.max(
                ans,
                arr[arr.length - 1][1] + (n - arr[arr.length - 1][0])
        );

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxBuilding(5, new int[][]{{2, 1}, {4, 1}})); // Output: 2
        System.out.println(maxBuilding(6, new int[][]{})); // Output: 5
        System.out.println(maxBuilding(10, new int[][]{{5, 3}, {2, 5}, {7, 4}, {10, 3}})); // Output: 5
    }
}
