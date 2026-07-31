package leetcode;

public class LC974 {
     /*
        Leetcode 974. Subarray Sums Divisible by K
        Prefix Sum Algorithm
    */

    static int subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        count[0] = 1;
        int prefixSum = 0;
        int result = 0;
        for (int num : nums) {
            prefixSum += num;
            int remainder = ((prefixSum % k) + k) % k; // Handle negative
            result += count[remainder];
            count[remainder]++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));
        System.out.println(subarraysDivByK(new int[]{5}, 9));
    }
}
