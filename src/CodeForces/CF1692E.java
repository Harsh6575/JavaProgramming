package CodeForces;

// Binary Deque

import java.util.Scanner;

public class CF1692E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt(); // length of array
            int s = sc.nextInt(); // required sum
            int[] arr = new int[n];
            int totalSum = 0; // current arrays total sum
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                totalSum+=arr[i];
            }
            if(totalSum<s){
                System.out.println(-1); // if total < required then it's impossible
                continue;
            }
            if (totalSum == s) {
                System.out.println(0); // if total == required then 0 steps needed
                continue;
            }
            int left = 0, sum = 0, maxLen = -1;
            for (int right = 0; right < n; right++) {
                sum += arr[right];

                while (sum > s && left <= right) {
                    sum -= arr[left++];
                }

                if (sum == s) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }
            }

            System.out.println(n - maxLen);
        }
        sc.close();
    }
}
