package leetcode;

public class LC1732 {
    /*
        Leetcode 1732. Find the Highest Altitude
        Prefix Sum
    */

    static int largestAltitude(int[] gain) {
        int[] ansA = new int[gain.length+1];
        ansA[0]=0;
        for (int i = 0; i < gain.length; i++) {
            ansA[i+1]=ansA[i]+gain[i];
        }
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < ansA.length; i++) {
            if (ansA[i]>ans){
                ans=ansA[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
}
