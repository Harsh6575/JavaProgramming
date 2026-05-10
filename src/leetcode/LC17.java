package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC17 {
    /*
        Leetcode 17. Letter Combinations of a Phone Number
        Subset Recursion
    */

    static List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;

        backtrack(res, new StringBuilder(), digits, 0, map);
        return res;
    }

    private static void backtrack(List<String> res, StringBuilder sb, String digits, int index, Map<Character, String> map) {
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }

        String str = map.get(digits.charAt(index));
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            backtrack(res, sb, digits, index + 1, map);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
