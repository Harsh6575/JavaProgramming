package CodeForces;

// Monsters

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OneEightFourNineB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextInt();
            long[] health = new long[n];
            List<pair> list = new ArrayList<>();
            int final_ans[] = new int[n];

            for (int i = 0; i < n; i++) {
                health[i] = sc.nextInt();
            }

            for(int i = 0; i < n; ++i) {
                list.add(new pair(health[i] % k, i + 1));
            }

            int index = 0;
            for(pair i : list) {
                if(i.value == 0L) {
                    final_ans[index++] = i.index;
                }
            }

            Collections.sort(list, Collections.reverseOrder());

            for(pair i : list) {
                if(i.value == 0L) {
                    continue;
                }
                final_ans[index++] = i.index;
            }

            StringBuilder sb = new StringBuilder();
            for(int i : final_ans) {
                sb.append(i).append(" ");
            }

            System.out.println(sb.toString().trim());
        }
    }

    static class pair implements Comparable<pair> {
        long value;
        int index;
        public pair(long value, int index) {
            this.value = value;
            this.index = index;
        }
        public int compareTo(pair p) {
            if(this.value > p.value) {
                return 1;
            } else if(this.value < p.value) {
                return -1;
            }
            return 0;
        }
    }
}