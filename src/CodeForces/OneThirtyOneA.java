package CodeForces;

// cAPS lOCK

import java.util.Scanner;

public class OneThirtyOneA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        // Case 1: All uppercase
        if (word.equals(word.toUpperCase())) {
            System.out.println(word.toLowerCase());
        }
        // Case 2: All except the first are uppercase
        else if (word.substring(1).equals(word.substring(1).toUpperCase())) {
            char firstChar = Character.toUpperCase(word.charAt(0));
            String rest = word.substring(1).toLowerCase();
            System.out.println(firstChar + rest);
        }
        // Case 3: Any other case, print as-is
        else {
            System.out.println(word);
        }
    }
}
