package leetcode;

public class LC1482 {
    /*
        Leetcode 1482. Minimum Number of Days to Make m Bouquets
        Binary Search, Greedy
    */

    static int minDays(int[] bloomDay, int m, int k){
      int ans=-1;
      int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
      for(int i=0;i<bloomDay.length;i++){
          low=Math.min(low,bloomDay[i]);
          high=Math.max(high,bloomDay[i]);
      }
      while(low<=high){
          int mid=low+(high-low)/2;
          int count=0;
          int bouquets=0;
          for(int i=0;i<bloomDay.length;i++){
              if(bloomDay[i]<=mid){
                  count++;
              }else {
                  count=0;
              }

              if(count==k){
                  bouquets++;
                  count=0;
              }
          }

          if(bouquets>=m){
              ans=mid;
              high=mid-1;
          }else {
              low=mid+1;
          }
      }
      return ans;
    }

    public static void main(String[] args) {
      System.out.println(minDays(new int[]{1,10,3,10,2},3,1));
      System.out.println(minDays(new int[]{1,10,3,10,2},3,2));
       System.out.println(minDays(new int[]{7,7,7,7,12,7,7},2,3));
    }
}
