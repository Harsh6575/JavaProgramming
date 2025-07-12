package CodeForces;

// Pillars

import java.util.Scanner;

public class OneOneNinetySevenB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Step 1: Find index of max element
        int maxIdx = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[maxIdx]) {
                maxIdx = i;
            }
        }

        // Step 2: Check strictly decreasing on left of max
        boolean valid = true;
        for (int i = maxIdx - 1; i >= 0; i--) {
            if (a[i] >= a[i + 1]) {
                valid = false;
                break;
            }
        }

        // Step 3: Check strictly decreasing on right of max
        for (int i = maxIdx + 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                valid = false;
                break;
            }
        }

        System.out.println(valid ? "YES" : "NO");
    }
}
