package CodeForces;

// Vanya and Lanterns

import java.util.Arrays;
import java.util.Scanner;

public class CF492B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of lanterns
        int l = sc.nextInt(); // length of the street
        int[] lanterns = new int[n];
        for (int i = 0; i < n; i++) {
            lanterns[i] = sc.nextInt(); // positions of the lanterns
        }
        sc.close();

        Arrays.sort(lanterns);
        double maxDistance = 0.0;
        // Calculate the maximum distance between adjacent lanterns
        for (int i = 1; i < n; i++) {
            double distance = (lanterns[i] - lanterns[i - 1]) / 2.0;
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }
        maxDistance = Math.max(maxDistance, lanterns[0] - 0.0);
        maxDistance = Math.max(maxDistance, l - lanterns[n - 1]);
        System.out.printf("%.10f%n", maxDistance);
    }
}
