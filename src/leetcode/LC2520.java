package leetcode;

public class LC2520 {
    /*
        Leetcode 2520. Count the Digits That Divide a Number
    */

    static int countDigits(int num) {
        int count = 0;
        String s = String.valueOf(num);
        for (char c : s.toCharArray()) {
            if (c - '0' != 0 && num % (c - '0') == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(7)); // 1
        System.out.println(countDigits(121)); // 2
        System.out.println(countDigits(1248)); // 4
    }
}
