package leetcode;

public class LC1922 {
    /*
        Leetcode 1922. Count Good Numbers
    */

    static int countGoodNumbers(long n) {
        long mod = 1000000007;

        long even = (n + 1) / 2;
        long odd = n / 2;

        long res = power(5, even, mod);
        res = (res * power(4, odd, mod)) % mod;

        return (int) res;
    }

    static long power(long base, long exp, long mod) {
        long result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }

            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(1));
        System.out.println(countGoodNumbers(4));
        System.out.println(countGoodNumbers(50));
    }
}
