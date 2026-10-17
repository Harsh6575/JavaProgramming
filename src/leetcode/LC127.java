
package leetcode;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class LC127 {

    /*
        Leetcode 127. Word Ladder
        BFS
    */

    static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words = new HashSet<>(wordList);
        if (!words.contains(endWord)) {
            return 0;
        }
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(beginWord);
        words.remove(beginWord);
        int count = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                String word = queue.poll();
                if (word.equals(endWord)) {
                    return count;
                }
                char[] chars = word.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char original = chars[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == original) {
                            continue;
                        }
                        chars[i] = c;
                        String nextWord = new String(chars);
                        if (words.remove(nextWord)) {
                            queue.offer(nextWord);
                        }
                    }
                    chars[i] = original;
                }
            }
            count++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(ladderLength(
                "hit", "cog",
                List.of("hot", "dot", "dog", "lot", "log", "cog")
        )); // 5

        System.out.println(ladderLength(
                "hit", "cog",
                List.of("hot", "dot", "dog", "lot", "log")
        )); // 0
    }
}
