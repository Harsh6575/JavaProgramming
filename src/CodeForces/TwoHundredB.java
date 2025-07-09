package CodeForces;

// Drinks

import java.util.Scanner;

public class TwoHundredB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int sum = 0;
        while (t-- >0){
            sum+=sc.nextInt();
        }
        double res = (double) sum / n;
        System.out.println(res);
    }
}
