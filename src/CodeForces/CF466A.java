package CodeForces;

// Cheap Travel

import java.util.Scanner;

public class CF466A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of rides needed
        int m = sc.nextInt(); // number of rides in a special ticket
        int a = sc.nextInt(); // cost of a single ticket
        int b = sc.nextInt(); // cost of a special ticket
        sc.close();

        // Option 1: all single tickets
        int cost1 = n * a;

        // Option 2: all special tickets (might overbuy)
        int cost2 = ((n + m - 1) / m) * b;

        // Option 3: combination of special + single
        int cost3 = (n / m) * b + (n % m) * a;

        int answer = Math.min(cost1, Math.min(cost2, cost3));
        System.out.println(answer);
    }
}
