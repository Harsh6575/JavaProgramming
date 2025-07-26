package CodeForces;

// Perfect Team

import java.util.Scanner;

public class CF1221C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int c = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(Math.min(Math.min(c, m), (c+m+x) / 3));
        }
        sc.close();
    }
}
