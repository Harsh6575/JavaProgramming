package leetcode;
import java.util.HashMap;

public class LC169 {
     /*
        Leetcode 169. Majority Element
        HashMap
    */

    static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
        arr = new int[]{3,2,3};
        System.out.println(majorityElement(arr));
    }
}
