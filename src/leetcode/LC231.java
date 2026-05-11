package leetcode;

public class LC231 {

    /*
        Leetcode 231. Power of Two
        Bit manipulation
     */

    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1)); // true
        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(isPowerOfTwo(3)); // false
    }
}