package CodeForces;

// Seating in a Bus

import java.util.Scanner;

public class CF2000B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            boolean ok = true;
            int min = arr[0], max = arr[0];
            for (int i = 1; i < n; i++) {
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
                int segmentSize = max - min + 1;
                if (segmentSize != i + 1) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}
