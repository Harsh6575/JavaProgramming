package leetcode;

public class LC2125 {
    /*
        Leetcode 2125. Number of Laser Beams in a Bank
    */

    static int numberOfBeams(String[] bank) {
        int totalBeams = 0;
        int prevCount = 0;
        for (String row : bank) {
            int count = 0;
            for (char c : row.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
            if (count > 0) {
                totalBeams += prevCount * count;
                prevCount = count;
            }
        }
        return totalBeams;
    }

    public static void main(String[] args) {
        System.out.println(numberOfBeams(new String[]{"011001","000000","010100","001000"})); // Output: 8
        System.out.println(numberOfBeams(new String[]{"000","111","000"})); // Output: 0
    }
}
