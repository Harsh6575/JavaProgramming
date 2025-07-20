package CodeForces;

// Hulk

import java.util.Scanner;

public class CF705A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i % 2 == 1 ? "I hate" : "I love");
            if (i < n) sb.append(" that ");
        }
        sb.append(" it");
        System.out.println(sb.toString());
    }
}
