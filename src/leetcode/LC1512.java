package leetcode;

public class LC1512 {
    /*
        Leetcode 1512. Number of Pairs of Interchangeable Rectangles
        
    */

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{ 1,2,3,1,1,3 })); // Output: 4
        System.out.println(numIdenticalPairs(new int[]{ 1,1,1,1 })); // Output: 6
        System.out.println(numIdenticalPairs(new int[]{ 1,2,3 })); // Output: 0
    }
}
