package leetcode;

public class LC1980 {
    /*
        Leetcode 1980. Find Unique Binary String
    */

    static String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = nums[i].charAt(i);
            sb.append(c == '0' ? '1' : '0');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] nums = {"111", "011", "001"};
        System.out.println(findDifferentBinaryString(nums));
    }
}
