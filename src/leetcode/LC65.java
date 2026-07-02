package leetcode;

public class LC65 {
    /*
        Leetcode 65. Valid Number
    */

    static boolean isNumber(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return false;
        }
        boolean hasDigit = false;
        boolean hasDot = false;
        boolean hasE = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (c == '+' || c == '-') {
                // Sign is valid only at start or immediately after e/E
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == '.') {
                if (hasDot || hasE) {
                    return false;
                }
                hasDot = true;
            } else if (c == 'e' || c == 'E') {
                if (hasE || !hasDigit) {
                    return false;
                }
                hasE = true;
                hasDigit = false;
            } else {
                return false;
            }
        }
        return hasDigit;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("0")); // Output: true
        System.out.println(isNumber("e")); // Output: false
        System.out.println(isNumber(".")); // Output: false
        System.out.println(isNumber("-1E+3")); // Output: true
    }
}
