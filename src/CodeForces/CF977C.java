package CodeForces;

// Less or Equal

import java.util.Arrays;
import java.util.Scanner;

public class CF977C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        if(k==0){
            int x = a[0] - 1;
            System.out.println(x >= 1 ? x : -1);
        }else {
            int x = a[k - 1];
            if (k < n && a[k] == x) {
                System.out.println(-1);
            } else {
                System.out.println(x);
            }
        }
    }
}
