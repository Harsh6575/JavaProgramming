package leetcode;

import java.util.Arrays;

public class LC1665 {
    /*
        Leetcode 171665. Minimum Initial Energy to Finish Tasks
    */

    static int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int energy = 0;
        int current = 0;

        for (int[] task : tasks) {
            int actual = task[0];
            int minimum = task[1];

            if (current < minimum) {
                energy += minimum - current;
                current = minimum;
            }

            current -= actual;
        }

        return energy;
    }

    public static void main(String[] args) {
        System.out.println(minimumEffort(new int[][]{{1,2},{2,4},{4,8}})); // Output: 8
        System.out.println(minimumEffort(new int[][]{{1,3},{2,4},{10,11},{10,12},{8,9}})); // Output: 32
    }
}
