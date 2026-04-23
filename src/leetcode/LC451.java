package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class LC451 {
     /*
        Leetcode 451. Sort Characters By Frequency
        String and HashMap
    */

    static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char key = entry.getKey();
            int value = entry.getValue();

            for (int i = 0; i < value; i++) {
                ans.append(key);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree")); // eert
        System.out.println(frequencySort("cccaaa")); // aaaccc or cccaaa
        System.out.println(frequencySort("Aabb")); // bbAa or bbaA
    }
}
