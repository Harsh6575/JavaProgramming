package leetcode;

public class LC1011 {
    /*
        Leetcode 1011. Capacity To Ship Packages Within D Days
        Binary Search, Array
    */

    static int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = (left + right) / 2;
            int need = 1, curr = 0;
            for (int w : weights) {
                if (curr + w > mid) {
                    need++;
                    curr = 0;
                }
                curr += w;
            }
            if (need <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5)); // 15
        System.out.println(shipWithinDays(new int[]{3,2,2,4,1,4}, 3)); // 6
    }
}
