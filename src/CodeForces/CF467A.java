package CodeForces;

// George and Accommodation

import java.util.Scanner;

public class CF467A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while (t-- > 0){
            int p=sc.nextInt();
            int q=sc.nextInt();
            if((p+2)<=q){
                count++;
            }
        }
        System.out.println(count);
    }
}
