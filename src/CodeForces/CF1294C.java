package CodeForces;

// Product of Three Numbers

import java.util.Scanner;

public class CF1294C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = 0, b = 0, c = 0;
            boolean found = false;

            // Find first divisor a
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    a = i;
                    n /= a;
                    break;
                }
            }

            if (a != 0) {
                for (int i = a + 1; i * i <= n; i++) {
                    if (n % i == 0) {
                        b = i;
                        c = n / b;
                        if (c > 1 && c != a && c != b) {
                            found = true;
                            System.out.println("YES");
                            System.out.println(a + " " + b + " " + c);
                        }
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
