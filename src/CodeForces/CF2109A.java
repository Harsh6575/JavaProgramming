package CodeForces;

// It's Time To Duel

import java.util.Scanner;

public class CF2109A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean liar = false;
            int count = 0;
            if (n == 2) {
                if (a[0] == a[1]) liar = true;
            } else {
                for (int i = 0; i < n - 1; i++) {
                    if (a[i] == 0 && a[i + 1] == 0) {
                        liar = true;
                        break;
                    }
                    if(a[i]==1){
                        count++;
                    }
                }
            }

            if (a[n - 1] == 1){
                count++;
            }
            if (count == n) {
                liar = true;
            }
            System.out.println(liar ? "YES" : "NO");
        }
        sc.close();
    }
}
