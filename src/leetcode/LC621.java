package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.HashMap;
import java.util.Map;

public class LC621 {
    /*
        Leetcode 621. Task Scheduler
        Heap, Priority Queue
    */

    static int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : tasks) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        Queue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(frequencyMap.entrySet());
        int time = 0;
        while (!maxHeap.isEmpty()) {
            int k = n + 1;
            Queue<Map.Entry<Character, Integer>> tempList = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
            while (k > 0 && !maxHeap.isEmpty()) {
                Map.Entry<Character, Integer> current = maxHeap.poll();
                current.setValue(current.getValue() - 1);
                if (current.getValue() > 0) {
                    tempList.offer(current);
                }
                time++;
                k--;
            }
            // Add remaining tasks back to the heap
            maxHeap.addAll(tempList);
            // If there are still tasks left, we need to account for idle time
            if (!maxHeap.isEmpty()) {
                time += k; // Add idle time
            }
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println(leastInterval(new char[]{'A','A','A','B','B','B'}, 2)); // 8
        System.out.println(leastInterval(new char[]{'A','C','A','B','D','B'}, 1)); // 6
        System.out.println(leastInterval(new char[]{'A','A','A','B','B','B'}, 3)); // 10
    }
}
