package CodeForces;

// Scuza

import java.util.Scanner;

public class CF1742E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[n];
            long[] prefixSum = new long[n];
            int[] prefixMax = new int[n];
            for (int i =0;i<n;i++){
                a[i]=sc.nextInt();
                prefixSum[i] = a[i] + (i > 0 ? prefixSum[i - 1] : 0);
                prefixMax[i] = Math.max(a[i], i > 0 ? prefixMax[i - 1] : 0);
            }
            for (int qi = 0; qi < q; qi++) {
                int k = sc.nextInt();
                // Binary search for the largest index where prefixMax[i] <= k
                int low = 0, high = n - 1, ans = -1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (prefixMax[mid] <= k) {
                        ans = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                System.out.print((ans == -1 ? 0 : prefixSum[ans]) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
