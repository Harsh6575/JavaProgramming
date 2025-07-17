package CodeForces;

// Elephant

import java.util.Scanner;

public class SixSeventeenA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] steps = {5,4,3,2,1};
        int ans = 0;
        for (int step : steps) {
            ans += n / step;
            n %= step;
        }
        System.out.println(ans);
    }
}
