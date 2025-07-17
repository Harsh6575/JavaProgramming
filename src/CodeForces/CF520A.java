package CodeForces;

// Pangram

import java.util.Scanner;

public class CF520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine().toLowerCase();

        if (input.length() < 26) {
            System.out.println("NO");
            return;
        }

        boolean[] seen = new boolean[26];
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                seen[ch - 'a'] = true;
            }
        }

        for (boolean b : seen) {
            if (!b) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
