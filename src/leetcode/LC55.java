package leetcode;

public class LC55 {
    /*
        Leetcode 55. Jump Game
        Greedy
    */

    static boolean canJump(int[] nums) {
        int maxReach=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxReach){
                return false;
            }
            maxReach=Math.max(maxReach,i+nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }
}
