package CodeForces;

// Cardboard for Pictures

import java.util.Scanner;

public class OneEightFiveZeroE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            long n = sc.nextLong();
            long c = sc.nextLong();

            long[] s = new long[(int)n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextLong();
            }

            long low = 0;
            long high = (long) 1e9;
            long ans = -1;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                long total = 0;

                for (int i = 0; i < n; i++) {
                    long side = s[i] + 2 * mid;
                    total += side * side;

                    // Early exit to avoid overflow
                    if (total > c) break;
                }

                if (total == c) {
                    ans = mid;
                    break;
                } else if (total < c) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
