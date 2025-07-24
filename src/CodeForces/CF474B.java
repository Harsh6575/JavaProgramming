package CodeForces;

// Worms

import java.util.Scanner;

public class CF474B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of piles
        int[] worms = new int[n];
        for (int i = 0; i < n; i++) {
            worms[i] = sc.nextInt(); // Number of worms in each pile
        }
        int m = sc.nextInt(); // Number of queries
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt(); // Read each query
        }
        sc.close();

        int[] prefixSum = new int[n];
        prefixSum[0] = worms[0]; // Initialize the first prefix sum
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + worms[i]; // Calculate prefix sums
        }
        for (int i = 0; i < m; i++) {
            int query = queries[i];
            // Binary search to find the pile containing the query worm
            int left = 0, right = n - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (prefixSum[mid] < query) {
                    left = mid + 1; // Move to the right half
                } else {
                    right = mid; // Move to the left half
                }
            }
            System.out.println(left + 1); // Output the pile index (1-based)
        }
    }
}
