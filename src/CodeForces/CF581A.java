package CodeForces;

// Vasya the Hipster

import java.util.Scanner;

public class CF581A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (a > b) {
            int t = a;
            a = b;
            b=t;
        }
        System.out.print(a + " ");
        System.out.println((b-a)/2);
    }
}
