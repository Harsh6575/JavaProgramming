package CodeForces;

// Uninteresting Number

import java.util.Scanner;

public class CF2050C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String n = sc.nextLine().trim();

            int baseSum = 0, cnt2 = 0, cnt3 = 0;
            // count no of 2s and 3s, and calculate the base sum
            for (char c : n.toCharArray()) {
                int d = c - '0';
                baseSum += d;
                if (d == 2) cnt2++;
                else if (d == 3) cnt3++;
            }

            boolean possible = false;
            // try and check for replace 2s and 3s and see if we can make the sum divisible by 9
            // we can replace 2 with 4 and 3 with 9
            // if for some combination of replacements the sum becomes divisible by 9
            // we can print "YES", otherwise "NO"
            for (int i = 0; i <= cnt2 && !possible; i++) {
                for (int j = 0; j <= cnt3; j++) {
                    int sum = baseSum + i * (4 - 2) + j * (9 - 3);
                    if (sum % 9 == 0) {
                        possible = true;
                        break;
                    }
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
