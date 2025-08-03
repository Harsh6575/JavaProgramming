package CodeForces;

// Race

import java.util.Scanner;

public class CF2112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int a = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int dAx = Math.abs(a - x);
            int dAy = Math.abs(a - y);
            boolean found = false;

            for (int b = 1; b <= 100; b++) {
                if (b == a) continue;
                int dBx = Math.abs(b - x);
                int dBy = Math.abs(b - y);

                if (dBx < dAx && dBy < dAy) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
        sc.close();
    }
}
