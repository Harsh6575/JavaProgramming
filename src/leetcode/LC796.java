package leetcode;

public class LC796 {
    /*
        Leetcode 796. Rotate String
    */
    static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String temp = s + s;
        return temp.contains(goal);
    }

    public static void main(String[] args) {
      System.out.println(rotateString("abcde", "cdeab"));
      System.out.println(rotateString("abcde", "abced"));
    }
}
