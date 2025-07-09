package CodeForces;

// Sum of Digits

import java.util.Scanner;

public class OneZeroTwoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());

        int steps = 0;

        if (sb.length() == 1) {
            System.out.println(0);
            return;
        }

        while (sb.length() >1){
            int sum = 0;
            for (int i = 0; i < sb.length(); i++) {
                sum += sb.charAt(i) - '0';
            }
            sb = new StringBuilder(String.valueOf(sum));
            steps++;
        }
        System.out.println(steps);
    }
}
