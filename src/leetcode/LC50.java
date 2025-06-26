package leetcode;

public class LC50 {
    /*
        Leetcode 50. Pow(x, n)
        Recursion
    */

    static double myPow(double x, int n) {
        if (x==0){
            return 0; 
        }
        if(x==1){
            return 1;
        }
//        if(n<0){
//
//        }
        if(n==0){
            return 1;
        }
        if (n==1){
            return x;
        }
//        return x*myPow(x,n-1);
        double ans=1;
        for(int i=1;i<n;i++){
            ans*=x;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0,-2));
    }
}
