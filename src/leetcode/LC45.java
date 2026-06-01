package leetcode;

public class LC45 {
    /*
        Leetcode 45. Jump Game II
        Greedy
    */

    static int jump(int[] nums) {
        int jumps=0;
        int currentEnd=0;
        int farthest=0;
        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==currentEnd){
                jumps++;
                currentEnd=farthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,1,1,4}));
        System.out.println(jump(new int[]{2,3,0,1,4}));
    }
}
