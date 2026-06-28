package leetcode;

public class LC2391 {
    /*
        Leetcode 2391. Minimum Amount of Time to Collect Garbage
    */

    static int garbageCollection(String[] garbage, int[] travel) {
        int totalTime = 0;
        int lastG = -1, lastP = -1, lastM = -1;

        for (int i = 0; i < garbage.length; i++) {
            String g = garbage[i];
            for (char c : g.toCharArray()) {
                if (c == 'G') {
                    totalTime++;
                    lastG = i;
                } else if (c == 'P') {
                    totalTime++;
                    lastP = i;
                } else if (c == 'M') {
                    totalTime++;
                    lastM = i;
                }
            }
        }

        for (int i = 0; i < travel.length; i++) {
            if (i < lastG) totalTime += travel[i];
            if (i < lastP) totalTime += travel[i];
            if (i < lastM) totalTime += travel[i];
        }

        return totalTime;
    }

    public static void main(String[] args) {
        System.out.println(garbageCollection(new String[]{"G","P","GP","GG"}, new int[]{2,4,3})); // 21
        System.out.println(garbageCollection(new String[]{"MMM","PGM","GP"}, new int[]{3,10})); // 37
    }
}
