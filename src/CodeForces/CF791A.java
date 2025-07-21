package CodeForces;

// Bear and Big Brother

import java.util.Scanner;

public class CF791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int count = 0;
        while (a<=b){
            a=a*3;
            b=b*2;
            count++;
        }
        System.out.println(count);
    }
}
