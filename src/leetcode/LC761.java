package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class LC761 {
    /*
        Leetcode 761. Special Binary String
        Greedy, Priority Queue
    */

    static String makeLargestSpecial(String s) {
        Queue<String> maxHeap = new PriorityQueue<>((a, b) -> b.compareTo(a));
        int count = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i) == '1' ? 1 : -1;
            if (count == 0) {
                String inner = makeLargestSpecial(s.substring(start + 1, i));
                maxHeap.offer("1" + inner + "0");
                start = i + 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            sb.append(maxHeap.poll());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeLargestSpecial("11011000")); // "11100100"
        System.out.println(makeLargestSpecial("10")); // "10"
        System.out.println(makeLargestSpecial("111000")); // "111000"
    }
}
