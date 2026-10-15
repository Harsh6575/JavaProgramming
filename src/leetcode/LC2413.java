package leetcode;

public class LC2413 {

    /*
        Leetcode 2413. Smallest Even Multiple
        Math
    */

    static int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }

    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5)); // Output: 10
        System.out.println(smallestEvenMultiple(6)); // Output: 6
    }
}
