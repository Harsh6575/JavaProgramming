package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC904 {
     /*
        Leetcode 904. Fruit Into Baskets
    */

    static int totalFruit(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < fruits.length; right++) {
            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);

            while (count.size() > 2) {
                count.put(fruits[left], count.get(fruits[left]) - 1);

                if (count.get(fruits[left]) == 0) {
                    count.remove(fruits[left]);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{1, 2, 1}));
        System.out.println(totalFruit(new int[]{0, 1, 2, 2}));
        System.out.println(totalFruit(new int[]{1, 2, 3, 2, 2}));
    }
}
