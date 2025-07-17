package CodeForces;

// Way Too Long Words

import java.util.Scanner;

public class CF71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String word = sc.next();
            if (word.length() <= 10) {
                System.out.println(word);
            } else {
                System.out.println("" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
            }
        }
    }
}
