package CodeForces;

// Same Differences

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CF1520D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Long> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                int key = a[i] - i;
                map.put(key, map.getOrDefault(key, 0L) + 1);
            }

            long count = 0;
            for (long freq : map.values()) {
                count += (freq * (freq - 1)) / 2;
            }

            System.out.println(count);
        }
        sc.close();
    }
}