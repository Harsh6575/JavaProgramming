package CodeForces;

// Reverse Binary Strings

import java.util.Scanner;

public class CF1437B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int badPairs = 0;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    badPairs++;
                }
            }
            System.out.println((badPairs+1) / 2);
        }
        sc.close();
    }
}
