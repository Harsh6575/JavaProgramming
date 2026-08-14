package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class LC973 {
    /*
        Leetcode 973. K Closest Points to Origin
        Heap, Priority Queue
    */

    static int[][] kClosest(int[][] points, int k) {
        Queue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(kClosest(new int[][]{{1,3},{-2,2}}, 1))); // [[-2,2]]
        System.out.println(Arrays.deepToString(kClosest(new int[][]{{3,3},{5,-1},{-2,4}}, 2))); // [[3,3],[-2,4]]
    }
}
