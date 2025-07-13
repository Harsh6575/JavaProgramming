package CodeForces;

// Road To Zero

import java.util.Scanner;

public class OneThreeFourTwoA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            b = Math.min(b, 2 * a); // replace b if b >2*a then it make sense to make a two times rather then b one time
            System.out.println(Math.min(x, y) * b + Math.abs(x - y) * a);
        }
        sc.close();
    }
}
