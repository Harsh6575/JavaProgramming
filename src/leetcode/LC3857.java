package leetcode;

public class LC3857 {
     /*
        Leetcode 3857. Minimum Cost to Split into Ones
    */

    static int minCost(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(minCost(3));
        System.out.print(minCost(4));
    }
}
