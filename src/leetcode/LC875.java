package leetcode;

public class LC875 {
    /*
        Leetcode 875. Koko Eating Bananas
    */

    static int minEatingSpeed(int[] piles, int h) {
        int left=1,right=0;
        for (int pile : piles) {
            right=Math.max(right,pile);
        }
        while (left<right){
            int mid=left+(right-left)/2;
            int hours=0;
            for (int pile : piles) {
                hours+=(pile+mid-1)/mid;
            }
            if(hours>h){
                left=mid+1;
            } else {
                right=mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
      System.out.println(minEatingSpeed(new int[]{3,6,7,11}, 8));
      System.out.println(minEatingSpeed(new int[]{30,11,23,4,20}, 5));
      System.out.println(minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }
}
