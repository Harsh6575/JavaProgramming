package leetcode;

public class LC3264 {

    /*
        Leetcode 3264. Final Array State After K Multiplication Operations I
    */

    static int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }
            
            nums[index] = min * multiplier;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] result = getFinalState(
            new int[]{2, 1, 3, 5, 6},
            5,
            2
        );

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}