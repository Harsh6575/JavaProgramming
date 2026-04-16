package leetcode;

public class LC1539 {
    /*
        Leetcode 1539. Kth Missing Positive Number
        
    */

    static int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int currentNum = 1;
        int index = 0;

        while (missingCount < k) {
            if (index < arr.length && arr[index] == currentNum) {
                index++;
            } else {
                missingCount++;
            }
            currentNum++;
        }
        return currentNum - 1; // Return the last missing number found
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2, 3, 4, 7, 11}, 5)); // Output: 9
        System.out.println(findKthPositive(new int[]{1, 2, 3, 4}, 2)); // Output: 6
    }
}
