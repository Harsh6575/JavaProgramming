package CodeForces;

// Assigning to Classes

import java.util.Arrays;
import java.util.Scanner;

public class CF1300B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[2*n];
            for (int i = 0; i < 2 * n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int diff = Math.abs(a[n] - a[n - 1]);
            System.out.println(diff);
        }
        sc.close();
    }
}
