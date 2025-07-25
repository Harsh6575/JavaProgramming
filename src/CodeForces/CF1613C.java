package CodeForces;

// Poisoned Dagger

import java.util.Scanner;

public class CF1613C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            long h = sc.nextLong();
            long[] x = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
            }

            long left = 1, right = h, answer = h;

            while (left <= right) {
                long mid = (left + right) / 2;
                long damage = mid;

                for (int i = 0; i < n - 1; i++) {
                    damage += Math.min(mid, x[i + 1] - x[i]);
                }

                if (damage >= h) {
                    answer = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}
