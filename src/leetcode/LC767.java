package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.HashMap;
import java.util.Map;

public class LC767 {
    /*
        Leetcode 767. Reorganize String
        Greedy, Priority Queue
    */

    static String reorganizeString(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        Queue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(frequencyMap.entrySet());
        StringBuilder sb = new StringBuilder();
        Map.Entry<Character, Integer> previous = null;
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> current = maxHeap.poll();
            // Can't use the same character consecutively
            if (previous != null && current.getKey() == previous.getKey()) {
                // No other character available
                if (maxHeap.isEmpty()) {
                    return "";
                }
                Map.Entry<Character, Integer> next = maxHeap.poll();
                sb.append(next.getKey());
                next.setValue(next.getValue() - 1);
                if (next.getValue() > 0) {
                    maxHeap.offer(next);
                }
                // Put current character back for the next iteration
                maxHeap.offer(current);
                previous = next;
            } else {
                sb.append(current.getKey());
                current.setValue(current.getValue() - 1);
                if (current.getValue() > 0) {
                    maxHeap.offer(current);
                }
                previous = current;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reorganizeString("aab")); // "aba"
        System.out.println(reorganizeString("aaab")); // ""
        System.out.println(reorganizeString("vvvlo")); // "vlvov"
    }
}
