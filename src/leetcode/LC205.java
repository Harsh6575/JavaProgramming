package leetcode;

public class LC205 {
     /*
        Leetcode 205. Isomorphic Strings
    */

    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1[c1] != map2[c2]) {
                return false;
            }

            map1[c1] = i + 1;
            map2[c2] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }
}
