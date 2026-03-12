package leetcode;

public class LC1009 {
    /*
        Leetcode 1009. Complement of Base 10 Integer
        Recursion, Maths
    */

    static int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int mask=1;
        while(mask<=n){
            mask=mask<<1;
        }
        return (mask-1)-n;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5)); // 2
        System.out.println(bitwiseComplement(7)); // 0
    }
}
