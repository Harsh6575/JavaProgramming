package leetcode;

public class LC2396 {
    /*
        Leetcode 2396. Strictly Palindromic Number
    */

    static boolean isStrictlyPalindromic(int n) {
        for (int base = 2; base <= n - 2; base++) {
            StringBuilder sb = new StringBuilder();
            int num = n;
            while (num > 0) {
                sb.append(num % base);
                num /= base;
            }
            String str = sb.toString();
            if (!str.equals(sb.reverse().toString())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(9)); // false
        System.out.println(isStrictlyPalindromic(4)); // false
    }
}
