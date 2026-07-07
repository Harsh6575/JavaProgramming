package leetcode;

public class LC1415 {
    /*
        Leetcode 1415. The k-th Lexicographical String of All Happy Strings of Length n
    */

    static int count;
    static String answer;

    static String getHappyString(int n, int k) {
        count = k;
        answer = "";

        backtrack(n, new StringBuilder(), ' ');

        return answer;
    }

    static void backtrack(int n, StringBuilder sb, char prev) {

        if (!answer.isEmpty()) {
            return;
        }

        if (sb.length() == n) {
            count--;

            if (count == 0) {
                answer = sb.toString();
            }
            return;
        }

        for (char c = 'a'; c <= 'c'; c++) {
            if (c == prev) {
                continue;
            }

            sb.append(c);

            backtrack(n, sb, c);

            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getHappyString(1,3)); // "c"
        System.out.println(getHappyString(1,4)); // ""
        System.out.println(getHappyString(3,9)); // "cab"
    }
}
