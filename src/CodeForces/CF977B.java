package CodeForces;

// Two-gram

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CF977B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        Map<String, Integer> freq = new HashMap<>();
        String result = "";
        int maxFreq = 0;

        for (int i = 0; i < n - 1; i++) {
            String twoGram = s.substring(i, i + 2);
            freq.put(twoGram, freq.getOrDefault(twoGram, 0) + 1);

            if (freq.get(twoGram) > maxFreq) {
                maxFreq = freq.get(twoGram);
                result = twoGram;
            }
        }

        System.out.println(result);
    }
}
