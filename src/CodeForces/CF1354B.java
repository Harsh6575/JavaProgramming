package CodeForces;

// Ternary String

import java.util.Scanner;

public class CF1354B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int left = 0, minLen = Integer.MAX_VALUE;
            int[] count = new int[4]; // 1-based index for chars '1', '2', '3'

            for (int right = 0; right < n; right++) {
                count[s.charAt(right) - '0']++;

                while (count[1] > 0 && count[2] > 0 && count[3] > 0) {
                    minLen = Math.min(minLen, right - left + 1);
                    count[s.charAt(left) - '0']--;
                    left++;
                }
            }

            System.out.println(minLen == Integer.MAX_VALUE ? 0 : minLen);
        }
        sc.close();
    }
}
