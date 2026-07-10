package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC93 {
     /*
        Leetcode 93. Restore IP Addresses
    */

    static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String s, int start, List<String> current, List<String> result) {
        if (current.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", current));
            }
            return;
        }

        for (int i = start; i < Math.min(start + 3, s.length()); i++) {
            String segment = s.substring(start, i + 1);
            if (isValid(segment)) {
                current.add(segment);
                backtrack(s, i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isValid(String segment) {
        if (segment.length() == 0 || segment.length() > 3) {
            return false;
        }
        if (segment.charAt(0) == '0' && segment.length() > 1) {
            return false;
        }
        try {
            int val = Integer.parseInt(segment);
            return val >= 0 && val <= 255;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("25525511135"));
        System.out.println(restoreIpAddresses("0000"));
        System.out.println(restoreIpAddresses("101023"));
    }
}
