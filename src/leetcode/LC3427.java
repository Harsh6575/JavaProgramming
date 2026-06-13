package leetcode;

public class LC3427 {
    /*
        Leetcode 3427. Sum of Variable Length Subarrays

    */

    static int subarraySum(int[] nums) {
        int[] prefix = new int[nums.length+1];
        for (int i=0;i<nums.length;i++){
            prefix[i+1] = prefix[i]+nums[i];
        }
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum+=prefix[i+1] - prefix[Math.max(0,i-nums[i])];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{2,3,1})); // 11
        System.out.println(subarraySum(new int[]{3,1,1,2})); // 13
    }
}
