package CodeForces;

// Divisibility Problem

import java.util.Scanner;

public class CF1328A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int rem = a % b;
            System.out.println(rem == 0 ? 0 : b - rem);
        }
        sc.close();
    }
}
