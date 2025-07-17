package CodeForces;

import java.util.Scanner;

public class CF996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = {100, 20, 10, 5, 1};
        int count = 0;
        for (int coin : coins) {
            count += n / coin;
            n %= coin;
        }
        System.out.println(count);
    }
}
