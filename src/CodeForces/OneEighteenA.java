package CodeForces;

// String Task

import java.util.Scanner;

public class OneEighteenA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if ("aeiouy".indexOf(ch) != -1) {
                continue; // skip vowels
            }
            sb.append('.');
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}